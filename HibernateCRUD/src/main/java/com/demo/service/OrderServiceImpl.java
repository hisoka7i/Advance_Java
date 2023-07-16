package com.demo.service;

import java.util.List;

import com.demo.beans.Orders;
import com.demo.beans.User;
import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImpl;

public class OrderServiceImpl  implements OrderService{
	OrderDao od = new OrderDaoImpl();

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return od.getUsers();
	}


	public User getProduct(int ch) {
		// TODO Auto-generated method stub
		return od.getProduct(ch);
	}


	public List<Orders> getAllOrder() {
		// TODO Auto-generated method stub
		return od.getOrders();
	}


	public int setProduct(int ch1, String newProduct) {
		// TODO Auto-generated method stub
		return od.setProduct(ch1,newProduct);
	}


	public void deleteProduct(String productName) {
		// TODO Auto-generated method stub
		od.deleteProduct(productName);
		return;
	}
	
	

}
