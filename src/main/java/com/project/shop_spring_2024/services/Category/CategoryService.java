package com.project.shop_spring_2024.services.Category;

import com.project.shop_spring_2024.dtos.CategoryDTO;
import com.project.shop_spring_2024.models.Category;
import com.project.shop_spring_2024.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    // Create category
    @Override
    public Category createCategory(CategoryDTO categoryDTO) {
        Category newCategory = Category.builder()
                .name(categoryDTO.getName())
                .build();
        return categoryRepository.save(newCategory);
    }
    // Get all categories
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    // Get a category by category id
    @Override
    public Category getCategoryById(long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }
    // Update a category
    @Override
    public Category updateCategory(
            long categoryId,
            CategoryDTO categoryDTO
    ) {
        Category existingCategory = getCategoryById(categoryId);
        existingCategory.setName(categoryDTO.getName());
        categoryRepository.save(existingCategory);
        return existingCategory;
    }
    // Delete a category
    @Override
    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }
}
