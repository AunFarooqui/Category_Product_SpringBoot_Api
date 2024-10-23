package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Dto;

public class ProductDTO {

    private String name;
    private int quantity;
    private double price;
    private int categoryId;

    // Default constructor
    public ProductDTO() {}

    // Parameterized constructor
    public ProductDTO(String name, int quantity, double price, int categoryId) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.categoryId = categoryId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
