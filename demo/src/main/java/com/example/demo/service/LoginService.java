package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	


	public String login(String username, String password) {
		
		System.out.println("yes" + username + password);
		
		if(username.equals("achille") && password.equals("123")) {
			return "login worked";
		}
		else {
			return "login did not work";
		}
	}

}
