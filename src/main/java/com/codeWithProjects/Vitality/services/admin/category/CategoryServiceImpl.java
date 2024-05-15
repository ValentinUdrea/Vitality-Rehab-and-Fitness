package com.codeWithProjects.Vitality.services.admin.category;

import com.codeWithProjects.Vitality.dto.CategoryDto;
import com.codeWithProjects.Vitality.entity.Category;
import com.codeWithProjects.Vitality.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;
    public Category createcategory(CategoryDto categoryDto){
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return  categoryRepository.save(category);
    }
}
