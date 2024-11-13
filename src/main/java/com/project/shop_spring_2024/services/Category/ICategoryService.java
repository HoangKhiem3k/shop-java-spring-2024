package com.project.shop_spring_2024.services.Category;

import com.project.shop_spring_2024.dtos.CategoryDTO;
import com.project.shop_spring_2024.models.Category;

import java.util.List;

public interface ICategoryService {
    Category createCategory(CategoryDTO category);
    Category getCategoryById(long id);
    List<Category> getAllCategories();
    Category updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}
