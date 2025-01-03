package com.cs.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		System.out.println("homeController.welcomeHome() :: shared memory obj class name ::"+map.getClass());
		map.put("attribute1", "val1");
		map.put("attribute2", "val2");
		return "home";
	}
	*/
	@RequestMapping("/home") 
	public String welcomeHome(Model model) {
		
		System.out.println("homeController.welcomeHome() :: shared memory obj class name "+model.getClass());
		model.addAttribute("attribute1", "val1");
		model.addAttribute("attribute2", new Date());
		return "home";
	}
	
	
 
}
