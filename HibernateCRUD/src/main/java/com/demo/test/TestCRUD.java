package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Orders;
import com.demo.beans.Products;
import com.demo.beans.User;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class TestCRUD {
	public static void main(String[] args) {
		OrderService os = new OrderServiceImpl();
		int i=0;
		do {
			System.out.println("Enter Your choice \n"
					+ "1. Show all Information\n"
					+ "2. Show all User Orders\n"
					+ "3. Show all products of orders search by userid\n"
					+ "4. Update Product, select by id\n"
					+ "5. Delete a Product from the Product List\n");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			switch(input) {
			case 1: List<User> u = os.getAllUsers();
			for(User i1: u) {
				System.out.println(i1.getUname());
			}
				break;
			case 2: List<Orders> lo = os.getAllOrder();
			for(Orders o: lo) {
				System.out.println("Product Name is: "+o.getPname()+"Product Quatity is: "+o.getQuantity());
			}
				break;
			case 3: 
				System.out.println("Enter the user ID here: ");
				int ch = scan.nextInt();
				User p = os.getProduct(ch);
				break;
			case 4: 
				System.out.println("Enter the product Id that you wish to update and enter new product in place of it");
				int ch1 = scan.nextInt();
				String newProduct = scan.next();
				os.setProduct(ch1,newProduct);
				//	System.out.println("The product was updated successfully");
				
				break;
			case 5: 
				System.out.println("Enter the product name that you wish to delete");
				String productName = scan.next();
				os.deleteProduct(productName);
				break;
			default: 
				break;
			}
			i++;
		}while(i<3);
	}
}
