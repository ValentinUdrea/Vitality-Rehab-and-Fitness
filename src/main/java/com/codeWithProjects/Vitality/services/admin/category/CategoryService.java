package com.codeWithProjects.Vitality.services.admin.category;

import com.codeWithProjects.Vitality.dto.CategoryDto;
import com.codeWithProjects.Vitality.entity.Category;

public interface CategoryService {
    Category createcategory(CategoryDto categoryDto);
}
