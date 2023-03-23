package com.AdminProducts.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productdetails")
public class AdminProductsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private float price;
	
	
	@Column(name="dateoflaunch")
	private String dateoflaunch;
	
	@Column(name="category")
	private String category;
	
	@Column(name="freedelivery")
	private boolean freedelivery;

	@Column(name="description")
	private String description;
	
	@Column(name="imageurl")
	private String imageurl;
	
	@Column(name="categoryimageurl")
	private String categoryimageurl;
	
	public AdminProductsModel(){
		
	}

	public AdminProductsModel(long id, String name, float price, String dateoflaunch, String category,
			boolean freedelivery, String description, String imageurl, String categoryimageurl) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.dateoflaunch = dateoflaunch;
		this.category = category;
		this.freedelivery = freedelivery;
		this.description = description;
		this.imageurl = imageurl;
		this.categoryimageurl = categoryimageurl;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDateoflaunch() {
		return dateoflaunch;
	}

	public void setDateoflaunch(String dateoflaunch) {
		this.dateoflaunch = dateoflaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreedelivery() {
		return freedelivery;
	}

	public void setFreedelivery(boolean freedelivery) {
		this.freedelivery = freedelivery;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getCategoryimageurl() {
		return categoryimageurl;
	}

	public void setCategoryimageurl(String categoryimageurl) {
		this.categoryimageurl = categoryimageurl;
	}

	@Override
	public String toString() {
		return "AdminProductsModel [id=" + id + ", name=" + name + ", price=" + price + ", dateoflaunch=" + dateoflaunch
				+ ", category=" + category + ", freedelivery=" + freedelivery + ", description=" + description
				+ ", imageurl=" + imageurl + ", categoryimageurl=" + categoryimageurl + "]";
	}

	
	
	
}