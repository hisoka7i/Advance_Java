package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Login;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/mylogin")
public class LoginController {
	@Autowired
	LoginService lser;
	
	
	
	@GetMapping("/login")
	public String showLoginPage() {
		System.out.println("login");
		return "Login";
	}
	
	@PostMapping("/validate")
	public ModelAndView validateUser(HttpSession session, @RequestParam("uname") String un, @RequestParam("pass") String pass) {
		System.out.println("validate");
		Login lg = lser.validateUser(un,pass);
		
		if(lg!=null) {
			session.setAttribute("user", lg);
			System.out.println(lg);
			return new ModelAndView("Hello","msg","Success");
		}
		return new ModelAndView("Login","msg","Please enter valid credentials");
	}
	
}
