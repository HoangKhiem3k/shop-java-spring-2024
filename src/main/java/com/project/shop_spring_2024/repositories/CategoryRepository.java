package com.project.shop_spring_2024.repositories;

import com.project.shop_spring_2024.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
