package com.cs.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;


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
	/*@RequestMapping("/home") 
	public String welcomeHome(Model model) {
		
		System.out.println("homeController.welcomeHome() :: shared memory obj class name "+model.getClass());
		model.addAttribute("attribute1", "val1");
		model.addAttribute("attribute2", new Date());
		return "home";
	}*/
	
	/*@RequestMapping("/home") 
	public String welcomeHome(ModelMap map) {
		
		System.out.println("homeController.welcomeHome() :: shared memory obj class name "+map.getClass());
		map.addAttribute("attribute1", "val1   ");
		LocalDateTime currentDateTime = LocalDateTime.now();
		map.addAttribute("attribute2", "   "+currentDateTime);
		return "home";	  
	}*/
	@RequestMapping("/home")   
	public String welcomeHome(Map<String, Object> map) {
		
		System.out.println("homeController.welcomeHome() :: shared memory obj class name "+map.getClass());
		map.put("attribute1", "val1   ");
		LocalDateTime currentDateTime = LocalDateTime.now();
		map.put("attribute2", "   "+currentDateTime);
		return "home";	
	}
 
}
