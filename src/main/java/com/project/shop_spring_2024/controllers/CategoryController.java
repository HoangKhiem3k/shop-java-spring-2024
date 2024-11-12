package com.project.shop_spring_2024.controllers;

import com.project.shop_spring_2024.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/categories" )

public class CategoryController {
    // Get all categories
    @GetMapping("") // http://localhost:8088/api/v1/categories?page=1&limit=10
    public ResponseEntity<String> getAllCategories(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ) {
        return ResponseEntity.ok(String.format("page = %d, limit = %d", page, limit));
    }

    // Create category
    // Nếu đối tượng truyền vào l 1 object(Data Transfer Object) thì tạo 1 dtos
    @PostMapping("")
    public ResponseEntity<?> createCategory(@Valid @RequestBody CategoryDTO categoryDTO, BindingResult result) {
        if(result.hasErrors()){
           List<String> errorMessages = result.getFieldErrors()
                    .stream()
                    // .map(fieldError -> fieldError.getDefaultMessage()) or
                    .map(FieldError::getDefaultMessage)
                    .toList();
           return ResponseEntity.badRequest().body(errorMessages);
        }
        return ResponseEntity.ok("Body: " + categoryDTO);
    }

    // Update category
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@PathVariable Long id) {
        return ResponseEntity.ok("update with id: " + id);
    }

    // Delete category
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        return ResponseEntity.ok("delete with id: " + id);
    }
}
