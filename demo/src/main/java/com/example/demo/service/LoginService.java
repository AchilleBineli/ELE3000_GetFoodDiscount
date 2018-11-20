package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	

//	private UserRepo user_repo;
	private UserService user_service = UserService.getInstance();
	
	public String login(String username, String password) {
		
		System.out.println("yes" + username + password);
		
		if(username.equals("achille") && password.equals("123")) {
			return "login worked";
		}
		else {
			return "login did not work";
		}
	}
	
	public String login1(String username, String password) {
		if(user_service.userExists(username, password)) {
			return "homepage";
		}
		else {
			return "home";
		}
	}
	


}
