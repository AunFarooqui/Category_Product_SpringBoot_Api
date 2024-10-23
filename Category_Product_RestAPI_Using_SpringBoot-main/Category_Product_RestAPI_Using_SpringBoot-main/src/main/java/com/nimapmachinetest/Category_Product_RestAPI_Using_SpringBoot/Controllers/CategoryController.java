package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Entities.CategoryEntity;
import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Services.CategoryServices;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api")
public class CategoryController {
     @Autowired
    private CategoryServices cService;
     
     @PostMapping("/categories/save")
    public CategoryEntity saveCategory(@RequestBody CategoryEntity category){
        return cService.saveCategory(category);
    }
    @GetMapping("/categories/findById/{id}")
    public Optional<CategoryEntity> findCategoryById(@PathVariable int id){
        return cService.findCategoryById(id);
    }

    @GetMapping("/categories/findAll")
    public List<CategoryEntity> findAllCategory(){
        return cService.findAllCategory();
    }

    // @PutMapping("/categories/findById/{id}")
    // public ResponseEntity<Void>  updateById(@PathVariable int id,@RequestBody CategoryEntity category){
    //    try {
    //         cService.updateById(id, category);
    //         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    //     } catch (EntityNotFoundException e) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    // }

    @DeleteMapping("/categories/delete/{id}")
    public void deleteById(@PathVariable int id){
        cService.deleteById(id);
    }
}
