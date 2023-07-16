package com.demo.dao;

import com.demo.beans.Login;
import com.demo.beans.Register;

public interface LoginDao {

	Login validate(Login l1);

	Register addUser(Register r1);

	void addLogin(Login l2);

	
}
