package com.project.shop_spring_2024.services.Product;

import com.project.shop_spring_2024.dtos.ProductDTO;
import com.project.shop_spring_2024.dtos.ProductImageDTO;
import com.project.shop_spring_2024.exceptions.DataNotFoundException;
import com.project.shop_spring_2024.models.Category;
import com.project.shop_spring_2024.models.Product;
import com.project.shop_spring_2024.models.ProductImage;
import com.project.shop_spring_2024.repositories.CategoryRepository;
import com.project.shop_spring_2024.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    // Create a new product
    @Override
    public Product createProduct(ProductDTO productDTO) throws DataNotFoundException {
        Category existingCategoryId = categoryRepository
                .findById(productDTO.getCategoryId())
                .orElseThrow(()-> new DataNotFoundException(
                        "Cannot find category with id: " + productDTO.getCategoryId()
                ));
        Product newProductCreated = Product.builder()
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .thumbnail(productDTO.getThumbnail())
                .category(existingCategoryId)
                .build();
        return productRepository.save(newProductCreated);
    }

    @Override
    public Product getProductById(long id) throws Exception {
        return null;
    }

    @Override
    public Page<Product> getAllProducts(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Product updateProduct(long id, ProductDTO productDTO) throws Exception {
        return null;
    }

    @Override
    public void deleteProduct(long id) {

    }

    @Override
    public boolean existsByName(String name) {
        return false;
    }

    @Override
    public ProductImage createProductImage(Long productId, ProductImageDTO productImageDTO) throws Exception {
        return null;
    }
}
