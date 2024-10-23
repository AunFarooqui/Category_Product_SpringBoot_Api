package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Dto.ProductDTO;
import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Entities.CategoryEntity;
import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Entities.ProductEntity;
import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.repositories.CategoryRepository;
import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.repositories.ProductRepository;
import java.util.ArrayList;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository pRepository;

    @Autowired
    private CategoryRepository cRepository;

    public ProductEntity saveProduct(ProductDTO productDto) {
        CategoryEntity c = cRepository.findById(productDto.getCategoryId()).get();
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(productDto.getName());
        productEntity.setPrice(productDto.getPrice());
        productEntity.setCategory(c);
        productEntity.setQuantity(productDto.getQuantity());
        return pRepository.save(productEntity);
    }

    public List<ProductEntity> saveProducts(List<ProductDTO> productsEntity) {
        List<ProductEntity> products = new ArrayList<>();
        for (ProductDTO productDTO : productsEntity) {
            CategoryEntity c = cRepository.findById(productDTO.getCategoryId()).get();
            ProductEntity productEntity = new ProductEntity();
            productEntity.setName(productDTO.getName());
            productEntity.setPrice(productDTO.getPrice());
            productEntity.setCategory(c);
            productEntity.setQuantity(productDTO.getQuantity());
            products.add(productEntity);
        }
        return pRepository.saveAll(products);
    }

    public Optional<ProductEntity> findProductById(int id) {
        return pRepository.findById(id);
    }

    public Optional<ProductEntity> findProductByName(String name) {
        return pRepository.findByName(name);
    }

    public Page<ProductEntity> getAllProduct(Pageable page) {
        return pRepository.findAll(page);
    }

    public ProductEntity updateProductById(int id, ProductEntity product) {
        return pRepository.updateProductById(id, product);
    }

    public String deleteById(int id) {
        pRepository.deleteById(id);
        return "product removed ...!";
    }
}
