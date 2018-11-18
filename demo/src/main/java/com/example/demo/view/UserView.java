package com.example.demo.view;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/users")
public class UserView {

//	@Autowired
//	UserService user_sv;
	
	@Autowired
	UserService user_sv;
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/register")
	public void addUser(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		
		System.out.println("username is : " + username + 
							"firstname is : " +  firstname + 
							"lastname is : " + lastname + 
							"password is :"  + password +
							"email is : " + email);
		session.setAttribute("username", username);
		
		
		User user = new User(username, firstname, lastname, password, email);
		user.toString();
		user_sv.addUser(user);
		response.sendRedirect("homepage");
	
//		return "homepage";
	}
}
