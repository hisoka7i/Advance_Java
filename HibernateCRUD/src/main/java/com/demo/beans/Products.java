package com.demo.beans;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productTable")
public class Products {
	@Id
	private int productId;
	private String productName;
	private float price;
	@Lob
	@Column(name="image_data")
	private  byte[] image1;
	@ManyToOne(fetch=FetchType.EAGER)
	private Orders ord2;
	
	
	public Products() {
		super();
	}
	public Products(int productId, String productName, float price, byte[] image1, Orders ord2) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.image1 = image1;
		this.ord2 = ord2;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public byte[] getImage1() {
		return image1;
	}
	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}
	public Orders getOrd2() {
		return ord2;
	}
	public void setOrd2(Orders ord2) {
		this.ord2 = ord2;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", price=" + price + ", image1="
				+ Arrays.toString(image1) + "]";
	}
	
	
	
}
