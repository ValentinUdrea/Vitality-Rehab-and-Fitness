package com.codeWithProjects.Vitality.services.admin.category;

import com.codeWithProjects.Vitality.dto.CategoryDto;
import com.codeWithProjects.Vitality.entity.Category;

import java.util.List;

public interface CategoryService {
    Category createcategory(CategoryDto categoryDto);
    List<Category> getAllCategories();
}
