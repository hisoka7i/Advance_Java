package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Login;
import com.demo.beans.Register;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao lDao;
	@Override
	public Login validateUser(String un, String pass) {
		// TODO Auto-generated method stub\
		//String username, String password, String emailid, String type
		Login l1 = new Login(un,pass,"123@123.com","user");
		return lDao.validate(l1) ;
	}
	@Override
	public Register addUser(String rName, String rPass, String rMail, String rType, String rGen) {
		// TODO Auto-generated method stub
		//String username, String password, String emaiId, String type, String gender
		Login l2 = new Login(rName,rPass,rMail,rType);
		Register r1 = new Register(rName,rPass,rMail,rType,rGen);
		lDao.addLogin(l2);
		return lDao.addUser(r1);
	}

}
