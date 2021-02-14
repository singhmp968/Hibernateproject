package com.Assign4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int ProductId;
	private String ProductName;
	private int price;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int productId, String productName, int price) {
		super();
		ProductId = productId;
		ProductName = productName;
		this.price = price;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", price=" + price + "]";
	}
	
}
