package com.cs.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeController {
	 
	/*
	@RequestMapping("/home")
	public String welcomeHome() {
		return "home";
	}
	*/
	/*
	@RequestMapping("/home") 
	public String welcomeHome(Map<String, Object> map) {
		
		System.out.println("homeController.welcomeHome()");
		map.put("attribute1", "val1");
		map.put("attribute2", "val2");
		return "home";
	}
	*/
	@RequestMapping("/home") 
	public String welcomeHome(Map<String, Object> map) {
		
		System.out.println("homeController.welcomeHome()");
		map.put("attribute1", "val1");
		map.put("attribute2", "val2");
		return "home";
	}
	
	
 
}
