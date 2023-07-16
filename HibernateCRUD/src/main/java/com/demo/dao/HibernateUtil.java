package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static SessionFactory sf;
	public static SessionFactory getMySession() {
		if(sf==null) {
			sf = new Configuration().configure().buildSessionFactory();
			return sf;
		}
		return null;
	}
	public void closeMySession() {
		sf.close();
	}
}
