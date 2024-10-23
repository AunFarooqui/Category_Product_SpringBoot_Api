# Category_Product_SpringBoot_Api

How did you run the code ?
After creating the API using springboot I used the the main file to run the project and used Postman to test the API's

DB Design
CREATE DATABASE IF NOT EXISTS NimapProductCategory;

SET SQL_SAFE_UPDATES = 0;

USE  NimapProductCategory;


CREATE TABLE Category_TBL (
 category_id int AUTO_INCREMENT,
 category_name VARCHAR(50) DEFAULT NULL,
 PRIMARY KEY (category_id)
 );
 
 CREATE TABLE Product_TBL (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(255) NOT NULL,
    product_quantity INT NULL,
    product_price Float  NULL,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES Category_TBL(category_id)
);
 
 drop table Category;


 
