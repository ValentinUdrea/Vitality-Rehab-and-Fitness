package com.codeWithProjects.Vitality.services.customer.review;

import com.codeWithProjects.Vitality.dto.OrderedProductsResponseDto;

public interface ReviewService {
    OrderedProductsResponseDto getOrderedProductsDetailsByOrderId(Long orderId);
}
