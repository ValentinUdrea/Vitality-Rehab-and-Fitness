package com.codeWithProjects.Vitality.services.auth;

import com.codeWithProjects.Vitality.dto.SignupRequest;
import com.codeWithProjects.Vitality.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    Boolean hasUserWithEmail(String email);
}
