package com.demo.dao;

import java.util.List;

import com.demo.beans.Orders;
import com.demo.beans.Products;
import com.demo.beans.User;

public interface OrderDao {

	List<User> getUsers();

	List<Orders> getOrders();

	User getProduct(int ch);

	int setProduct(int ch1, String newProduct);

	void deleteProduct(String productName);

}
