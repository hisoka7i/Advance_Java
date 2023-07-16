package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Register;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/myregister")
public class RegistrationController {
	@Autowired
	LoginService lser;
	
	@GetMapping("/register")
	public String registrationPage() {
		//System.out.println("register");
		return "Registration";
	}
	//regName, regEmail, regPass, regType, regGen
	@PostMapping("/add")
	public ModelAndView addNew(HttpSession session, @RequestParam("regName") String rName, @RequestParam("regEmail") String rMail, @RequestParam("regPass") String rPass, @RequestParam("regType") String rType, @RequestParam("regGen") String rGen) {
		
		//String username, String password, String emaiId, String type, String gender
		Register reg = lser.addUser(rName,rPass,rMail,rType,rGen);
		if(reg!=null) {
			return new ModelAndView("Login","msg","New User is Added");
		}
		return new ModelAndView("Login","msg","Failed to add user");
		
	}
	
}
