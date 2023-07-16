package com.demo.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	private int quantity;
	private float price;
	@Id
	private int orderId;
	private String email;
	private String pname;
	@ManyToOne
	@JoinColumn(name="oid")
	private User usr1;
	@OneToOne(mappedBy="ord1", cascade=CascadeType.ALL)
	private Payment pay1;
	@OneToMany(mappedBy="ord2", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Products>  products;
	
	
	@Override
	public String toString() {
		return "Orders [quantity=" + quantity + ", price=" + price + ", orderId=" + orderId + ", email=" + email
				+ ", pname=" + pname + ", pay1=" + pay1 + ", products=" + products + "]";
	}

	public Orders() {
		super();
	}

	public Orders(int quantity, float price, int orderId, String email, String pname, User usr1, Payment pay1,
			List<Products> products) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.orderId = orderId;
		this.email = email;
		this.pname = pname;
		this.usr1 = usr1;
		this.pay1 = pay1;
		this.products = products;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public User getUsr1() {
		return usr1;
	}
	public void setUsr1(User usr1) {
		this.usr1 = usr1;
	}
	public Payment getPay1() {
		return pay1;
	}
	public void setPay1(Payment pay1) {
		this.pay1 = pay1;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	
}
