package com.demo.service;

import com.demo.beans.Login;
import com.demo.beans.Register;

public interface LoginService {

	Login validateUser(String un, String pass);

	Register addUser(String rName, String rPass, String rMail, String rType, String rGen);

}
