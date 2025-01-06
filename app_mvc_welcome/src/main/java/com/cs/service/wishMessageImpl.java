package com.cs.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class wishMessageImpl implements IWishMessageService {

	@Override
	public String wishMessage() {
		LocalDateTime ldt = LocalDateTime.now();
		int time = ldt.getHour();
		if(time < 12) {
			return "Good Moring";
		}
		else if(time > 12 && time < 16) {
			return "Good Afternoon";
		}
		else {
			return "Good evening";
		}
		
	}

}
