package com.example.demo.model;

public class Product {

	private int id;
	private String item;
	private int quantity;
	private float amount;
	
	public Product() {}
	
	public Product(int id, String item, int quantity, float amount) {
		super();
		this.id = id;
		this.item = item;
		this.quantity = quantity;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", item=" + item + ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
}
