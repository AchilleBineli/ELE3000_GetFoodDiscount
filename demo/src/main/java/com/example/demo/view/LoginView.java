package com.example.demo.view;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.LoginService;

@Controller
public class LoginView {
	
	
	@Autowired
	private LoginService log_service;
	
	public Iterable<User> users;

	
	@RequestMapping("/login3")
	public void simpleLogin(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Username: " + name + "password : " + password );
		session.setAttribute("username", name);
		if(name.equals("achille") && password.equals("123")) {
			response.sendRedirect("homepage");
		}
		else {
			response.sendRedirect("home");
		}
	}
	
	@RequestMapping("/login1")
	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		session.setAttribute("username", username);
		log_service.login(username, password);
	}
}
