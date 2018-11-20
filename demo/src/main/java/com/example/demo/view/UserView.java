package com.example.demo.view;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/users")
public class UserView {

//	private UserRepo user_repo;
	
	@Autowired
	UserService user_sv = UserService.getInstance();
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/register_page")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping("/register")
	public void addUser(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		String username = request.getParameter("username");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		User user = new User(username, firstname, lastname, password, email);
		user.toString();
		user_sv.addUser(user);
		response.sendRedirect("home");
	}
	
	@RequestMapping("/all")
	public void viewAllUsers() {
		user_sv.viewAll();
	}
}
