package com.project.shop_spring_2024.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetailDTO {
    @JsonProperty("order_id")
    @Min(value = 1, message = "Order's ID must be greater 0")
    private Long orderId;

    @Min(value = 1, message = "Product's ID must be greater 0")
    @JsonProperty("product_id")
    private Long productId;

    @Min(value = 0, message = "Price must be greater than or equal to 0")
    private Long price;

    @Min(value = 0, message = "Number of products must be greater than or equal to 0")
    @JsonProperty("number_of_products")
    private int numberOfProducts;

    @Min(value = 0, message = "Total money must be greater than or equal to 0")
    @JsonProperty("total_money")
    private int totalMoney;

    private String color;
}
