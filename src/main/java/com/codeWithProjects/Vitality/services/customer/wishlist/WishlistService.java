package com.codeWithProjects.Vitality.services.customer.wishlist;

import com.codeWithProjects.Vitality.dto.WishlistDto;
import org.springframework.stereotype.Service;


public interface WishlistService {

    WishlistDto addProductToWishlist(WishlistDto wishlistDto);
}
