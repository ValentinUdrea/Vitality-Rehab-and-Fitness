package com.codeWithProjects.Vitality.services.customer.review;

import com.codeWithProjects.Vitality.dto.OrderedProductsResponseDto;
import com.codeWithProjects.Vitality.dto.ReviewDto;

import java.io.IOException;

public interface ReviewService {
    OrderedProductsResponseDto getOrderedProductsDetailsByOrderId(Long orderId);

    ReviewDto giveReview(ReviewDto reviewDto) throws IOException;
}
