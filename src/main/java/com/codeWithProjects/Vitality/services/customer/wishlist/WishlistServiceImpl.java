package com.codeWithProjects.Vitality.services.customer.wishlist;

import com.codeWithProjects.Vitality.dto.WishlistDto;
import com.codeWithProjects.Vitality.entity.Product;
import com.codeWithProjects.Vitality.entity.User;
import com.codeWithProjects.Vitality.entity.Wishlist;
import com.codeWithProjects.Vitality.repository.ProductRepository;
import com.codeWithProjects.Vitality.repository.UserRepository;
import com.codeWithProjects.Vitality.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WishlistServiceImpl implements WishlistService{

    private final UserRepository userRepository;

    private final ProductRepository productRepository;

    private final WishlistRepository wishlistRepository;

    public WishlistDto addProductToWishlist(WishlistDto wishlistDto){
        Optional<Product>   optionalProduct = productRepository.findById(wishlistDto.getProductId());
        Optional <User> optionalUser = userRepository.findById(wishlistDto.getUserId());

        if(optionalProduct.isPresent() && optionalUser.isPresent()){
            Wishlist wishlist = new Wishlist();
            wishlist.setProduct(optionalProduct.get());
            wishlist.setUser(optionalUser.get());

            return wishlistRepository.save(wishlist).getWishlistDto();
        }
        return null;
    }
}
