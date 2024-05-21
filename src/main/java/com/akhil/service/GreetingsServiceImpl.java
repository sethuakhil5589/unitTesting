package com.akhil.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.akhil.Entity.Tourists;
@Service
public class GreetingsServiceImpl implements IGreetingsService{

	@Override
	public String greeting() {
		int hours=LocalDateTime.now().getHour();
		if(hours<12) {
			return "Good Morning";
		}
		else if(hours<16) {
			return "Good Afternoon";
		}
		else if(hours<20){
			return "Good Evening";
		}
		else
			return "Good Night";
	}

	@Override
	public String saveData(Tourists tourist) {
		// Logic for saving data to DB will be present here.
		return "Data saved successfully";
	}

}
