package com.demo.service;

import java.util.List;

import com.demo.beans.Orders;
import com.demo.beans.Products;
import com.demo.beans.User;

public interface OrderService {

	List<User> getAllUsers();

	List<Orders> getAllOrder();

	User getProduct(int ch);

	int setProduct(int ch1, String newProduct);

	void deleteProduct(String productName);


}
