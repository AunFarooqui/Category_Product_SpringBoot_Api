package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

	Optional<ProductEntity> findByName(String name);

     @Modifying
    @Query("UPDATE ProductEntity p SET p.name = ?2, p.price = ?3, p.quantity = ?4 WHERE p.id = ?1")
    ProductEntity updateProductById(int id, ProductEntity product);
    
}
