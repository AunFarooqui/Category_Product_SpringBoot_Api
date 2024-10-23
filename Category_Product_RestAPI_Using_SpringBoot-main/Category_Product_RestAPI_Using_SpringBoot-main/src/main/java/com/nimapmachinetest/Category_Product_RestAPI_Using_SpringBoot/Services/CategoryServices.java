package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Entities.CategoryEntity;
import com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.repositories.CategoryRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class CategoryServices {
        @Autowired
	    private CategoryRepository cRepository;

	    public CategoryEntity saveCategory(CategoryEntity category){
	        return cRepository.save(category);
	    }

	    public Optional<CategoryEntity> findCategoryById(int id){
	        return cRepository.findById(id);
	    }

	    public List<CategoryEntity> findAllCategory(){
	        return cRepository.findAll();
	    }
        // @Transactional
	    // public void updateById(int id,CategoryEntity category){
	    //      if (cRepository.existsById(id)) {
        //     cRepository.updateById(id, category.getCategory_name());
        // } else {
        //     throw new EntityNotFoundException("Category with ID " + id + " not found");
        // }
	    // }

	    public void deleteById(int id){
	        cRepository.deleteById(id);
	    }
}
