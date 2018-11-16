package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("welcomepage")
	public String welcome() {
		System.out.println("Print the welcome page");
		return "welcomepage";
	}

}
