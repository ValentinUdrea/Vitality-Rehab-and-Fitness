package com.codeWithProjects.Vitality.services.cart;

import com.codeWithProjects.Vitality.dto.AddProductInCartDto;
import com.codeWithProjects.Vitality.dto.OrderDto;
import com.codeWithProjects.Vitality.dto.PlaceOrderDto;
import org.springframework.http.ResponseEntity;

public interface CartService {
    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);

    OrderDto getCartByUserId(Long userId);

    OrderDto applyCoupon(Long userId, String code);


    OrderDto increaseProductQuantity(AddProductInCartDto addProductInCartDto);

    OrderDto decreaseProductQuantity(AddProductInCartDto addProductInCartDto);

    OrderDto placeOrder(PlaceOrderDto placeOrderDto);
}
