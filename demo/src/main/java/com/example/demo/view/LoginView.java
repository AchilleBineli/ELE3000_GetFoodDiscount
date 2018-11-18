package com.example.demo.view;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;

@Controller
public class LoginView {
	
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	@RequestMapping("homepage")
	public String homepage() {
		return "homepage";
	}
	
	@RequestMapping("/login")
	public ModelAndView simpleLogin(@RequestParam("name") String name) {
		ModelAndView mav = new ModelAndView("homepage");
		mav.addObject("username", name);
		mav.setViewName("homepage");
		return mav;
	}
	
	@RequestMapping("/login2")
	public ModelAndView simpleLogin(Employee emp) {
		ModelAndView mav = new ModelAndView("homepage");
		mav.addObject("username", emp.getName());
		return mav;
	}
	
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
}
