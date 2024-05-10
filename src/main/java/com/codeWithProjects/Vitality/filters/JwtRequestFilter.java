package com.codeWithProjects.Vitality.filters;

import com.codeWithProjects.Vitality.utils.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

//This request filter will be responsible for validation of the token

@Component
@RequiredArgsConstructor
public class JwtRequestFilter extends OncePerRequestFilter {

    private final UserDetailsServiceImpl userDetailsService;

    private final JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization"); //Header
        String token = null;
        String username = null;

        if(authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7); //In this condition we will get
            //the token from out auth header and we will sake that token in the token variable
            username = jwtUtil.extractUsername(token);
        }
        //Validates that the username is not null and security context holder is null
        if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){
            UserDetails userDetails = UserDetailsService.loadUserByUsername(username);


            if(jwtUtil.validateToken(token, userDetails)){
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,null);
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));//we set the details of the request
                SecurityContextHolder.getContext().setAuthentication(authToken);//we update our security context holder with authToken
            }


        }
        filterChain.doFilter(request, response); //We do this so we can procees with other validations

    }
}
