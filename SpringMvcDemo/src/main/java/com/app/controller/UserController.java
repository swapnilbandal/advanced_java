package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	@RequestMapping("/user")
	public String showMyPage() {
		return "userForm";
	}
	@RequestMapping("/show")
	public String displayPage(HttpServletRequest request,Model model) {
		String name=request.getParameter("username");
		name=name.toUpperCase();
		String message= "Hello "+name;                                          
		model.addAttribute("msg",message);
		return "displayUser";
	}
//	@RequestMapping("/show")
//	public String displayPage(HttpServletRequest request,Model model) {
//		String name=request.getParameter("username");
//		name=name.toUpperCase();
//		String message= "Hello"+name;
//		model.addAttribute("msg",message);
//		return "displayUser";
//	}
}
