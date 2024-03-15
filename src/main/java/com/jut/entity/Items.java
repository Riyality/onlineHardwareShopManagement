package com.jut.entity;

import org.springframework.stereotype.Component;

@Component
public class Items {
    private int id;
    private String name;
    private int price;
    private String category;
    private String manufacturer;
    private int stock;
    
    public Items() {
		
	}

	public Items(int id, String name, int price, String category, String manufacturer, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.manufacturer = manufacturer;
		this.stock = stock;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
}

