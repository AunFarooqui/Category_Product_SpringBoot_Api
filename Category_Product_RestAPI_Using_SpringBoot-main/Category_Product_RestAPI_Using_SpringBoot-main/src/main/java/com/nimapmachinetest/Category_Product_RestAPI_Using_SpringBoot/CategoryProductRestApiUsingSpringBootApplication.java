package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories(basePackages = "com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.repositories")
public class CategoryProductRestApiUsingSpringBootApplication {

	public static void main(String[] args) {	
		SpringApplication.run(CategoryProductRestApiUsingSpringBootApplication.class, args);
	}

}
