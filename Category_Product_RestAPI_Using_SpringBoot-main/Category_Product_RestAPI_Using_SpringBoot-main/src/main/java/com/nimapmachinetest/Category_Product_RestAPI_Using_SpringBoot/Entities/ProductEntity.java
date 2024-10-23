package com.nimapmachinetest.Category_Product_RestAPI_Using_SpringBoot.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class ProductEntity {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private int quantity;
    @Column
    private double price;
    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "category_id" ,nullable=false)
	    @JsonBackReference
	    private CategoryEntity category;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public CategoryEntity getCategory() {
			return category;
		}
		public void setCategory(CategoryEntity category) {
			this.category = category;
		}
		public void setQuantity(int quantity) {
			this.quantity=quantity;
		}
		public int getQuantity() {
			return quantity;
		}
}



// import java.util.Locale.Category;

// // import javax.annotation.processing.Generated;
// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import com.fasterxml.jackson.annotation.JsonBackReference;

// @Entity
// public class ProductEntity {

    // @Id 
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private int id;
    // private String product;
	// private double price;
    //  @ManyToOne(cascade = CascadeType.ALL)
	//     @JoinColumn
	//     @JsonBackReference
	//     private Category category;
	// 	public int getId() {
	// 		return id;
	// 	}
	// 	public void setId(int id) {
	// 		this.id = id;
	// 	}
	// 	public String getProduct() {
	// 		return product;
	// 	}
	// 	public void setProduct(String product) {
	// 		this.product = product;
	// 	}
	// 	public double getPrice() {
	// 		return price;
	// 	}
	// 	public void setPrice(double price) {
	// 		this.price = price;
	// 	}
	// 	public Category getCategory() {
	// 		return category;
	// 	}
	// 	public void setCategory(Category category) {
	// 		this.category = category;
	// 	}
// }
