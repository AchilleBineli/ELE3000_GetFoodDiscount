package com.example.demo.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/resgiter")
	public String addUser(@RequestParam String username, 
			@RequestParam String firstname,
			@RequestParam String lastname,
			@RequestParam String password,
			@RequestParam String email) {
		
		System.out.println(username + firstname+ lastname+ password+ email);
		User user = new User(username, firstname, lastname, password, email);
		user_sv.addUser(user);
		return "home";
	}
}
