package com.project.shop_spring_2024.services.Product;

import com.project.shop_spring_2024.dtos.ProductDTO;
import com.project.shop_spring_2024.dtos.ProductImageDTO;
import com.project.shop_spring_2024.models.Product;
import com.project.shop_spring_2024.models.ProductImage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<Product> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(Long productId, ProductImageDTO productImageDTO) throws Exception;
}
