package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Orders;
import com.demo.beans.Payment;
import com.demo.beans.Products;
import com.demo.beans.Register;
import com.demo.beans.User;

public class FirstTest {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		
		Transaction tr = sess.beginTransaction();
		
		//int userid, String password, String address, String mobileno, String email, User usr
		
		Register reg = new Register(2,"234@234","Zila Gurugram","9940529076","234@234.com",null);
		
		//int userId, String uname, String upass, Register reg
		User usr = new User(2,"user","234@234",reg,null);
		
		
		List<Orders> ords = new ArrayList<Orders>();
		List<Products> productList = new ArrayList<Products>();
		//int quantity, float price, int orderId, String email, String pname, User usr
		Orders o1 = new Orders(7,939.12f,123,"rohit@hotmail.com","Kett",null,null,null);
		Orders o2 = new Orders(5,101.2f,124,"rohit@hotmail.com","Bedss",null,null,null);
		Orders o3 = new Orders(42,102.12f,129,"rohit@hotmail.com","Blank",null,null,null);
		
		//Adding products into the productList
		//int productId, String productName, float price, byte[] image1, Orders ord2
		Products p1 = new Products(3,"Gold",9999,null,null);
		Products p2 = new Products(25,"Diamodns",539,null,null);
		
		productList.add(p2);
		productList.add(p1);
		//String card, String email, String bankName, int bankId, double amount, Orders ord1
		Payment payment1 = new Payment("Master","234@234.com","PayTm Payment Bank",122,1223.22,null);
		//Payment payment2 = new Payment ("VISA","123@123.com","PayTm Payment Bank",12,123.22,null);

		
		ords.add(o1);
		ords.add(o2);
		ords.add(o3);

		o1.setProducts(productList);
		
		o1.setUsr1(usr);
		o2.setUsr1(usr);
		o3.setUsr1(usr);
		o1.setPay1(payment1);
		o2.setPay1(payment1);
		o3.setPay1(payment1);
		p1.setOrd2(o1);
		p2.setOrd2(o1);
		payment1.setOrd1(o1);
		usr.setOrd(ords);
		reg.setUsr(usr);
		//usr.setReg(reg);
		
		
		sess.save(usr);
		sess.save(p1);
		sess.save(p2);
		sess.save(payment1);
		sess.save(reg);
		
		sess.save(o1);
		sess.save(o2);
		sess.save(o3);
		
		
		//Sending object to persistence state
		//sess.save(usr);
		
		
		tr.commit();
		
		
//		User u1 = sess.load(User.class, 1);
//		System.out.println("Before");
//		System.out.println(u1.getUname());
//		System.out.println("After");
//		System.out.println(u1.getReg());
		sess.close();
		sf.close();
	}
}
