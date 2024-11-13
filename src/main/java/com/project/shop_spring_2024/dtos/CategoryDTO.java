package com.project.shop_spring_2024.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data // Tương tự toString()
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    @NotEmpty(message = "Category's name cannot be empty")
    private String name;
}
