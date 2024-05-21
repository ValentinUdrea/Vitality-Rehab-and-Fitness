package com.codeWithProjects.Vitality.services.cart;

import com.codeWithProjects.Vitality.dto.AddProductInCartDto;
import org.springframework.http.ResponseEntity;

public interface CartService {
    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);
}
