package com.codeWithProjects.Vitality.services.customer.wishlist;

import com.codeWithProjects.Vitality.dto.WishlistDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface WishlistService {

    WishlistDto addProductToWishlist(WishlistDto wishlistDto);

    List<WishlistDto> getWishlistByUserId(Long userId);
}
