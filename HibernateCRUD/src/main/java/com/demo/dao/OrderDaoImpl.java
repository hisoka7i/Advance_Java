package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.beans.Orders;
import com.demo.beans.Products;
import com.demo.beans.User;

public class OrderDaoImpl implements OrderDao {
	private static SessionFactory sf;
	static {
		sf = HibernateUtil.getMySession();
	}
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		String qry = "from User";
		Query query = sess.createQuery(qry);
		List<User> u= query.list();
		tr.commit();
		sess.close();
		return u;
	}
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		String qry = "from Orders";
		Query query = sess.createQuery(qry);
		List<Orders> o = query.getResultList();
		tr.commit();
		sess.clear();
		sess.close();
		return o;
	}
	public User getProduct(int ch) {
		// TODO Auto-generated method stub
		Session sess  = sf.openSession();
		Transaction tr = sess.beginTransaction();
		User u = sess.get(User.class, ch);
		//we are doing tr.commit because we need to bring object from transient state to persistence state.
		tr.commit();
		sess.clear();
		sess.close();
		return u;
	}
	
	public int setProduct(int ch1, String newProduct) {
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		Products u = sess.get(Products.class, ch1);
		u.setProductName(newProduct);
		sess.update(u);
		tr.commit();
		sess.close();
		return 0;	
	}
	public void deleteProduct(String productN) {
		// TODO Auto-generated method stub
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		Query query = sess.createQuery("delete from Products p where p.productName=:pn");
		query.setParameter("pn", productN);
		int p = query.executeUpdate();
		tr.commit();
		sess.clear();
		sess.close();
		//Product p = sess.get(Product.class, sess)
		if(p>0) {
			System.out.println("Product deleted Successfully!!");
		}
		return;
		
	}
	
}
