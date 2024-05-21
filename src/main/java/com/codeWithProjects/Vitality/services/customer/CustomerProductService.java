package com.codeWithProjects.Vitality.services.customer;

import com.codeWithProjects.Vitality.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {

    List<ProductDto> searchProductByTitle(String title);

    List<ProductDto> getAllProducts();
}
