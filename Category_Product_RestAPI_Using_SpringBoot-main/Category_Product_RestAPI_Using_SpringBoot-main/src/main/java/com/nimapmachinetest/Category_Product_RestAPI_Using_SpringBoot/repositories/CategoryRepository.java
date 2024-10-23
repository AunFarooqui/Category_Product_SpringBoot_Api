package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Entities.CategoryEntity;

import jakarta.transaction.Transactional;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

     @Modifying
     @Transactional  
     @Query("UPDATE CategoryEntity c SET c.name = :name WHERE c.id = :id")
     void updateById(@Param("id") int id, @Param("name") String name);
    
}
