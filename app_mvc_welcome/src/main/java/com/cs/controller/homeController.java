package com.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeController {
	
	@RequestMapping("/home")
	public String welcomeHome() {
		return "home";
	}
 
}
