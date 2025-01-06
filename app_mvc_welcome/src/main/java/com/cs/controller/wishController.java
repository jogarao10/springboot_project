package com.cs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs.service.IWishMessageService;

@Controller
public class wishController {
	   
	@Autowired 
	private IWishMessageService service;
	
	@RequestMapping("/wishMessage") 
	public String wishMessage(Map<String, Object> map) {
		
		System.out.println("wishController.wishMessage()");
		String msg = service.wishMessage();
		map.put("resultMessage", msg);
		return "wishMessage";
	} 

}
