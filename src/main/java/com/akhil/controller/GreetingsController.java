package com.akhil.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.akhil.Entity.Tourists;
import com.akhil.service.IGreetingsService;

@Controller
public class GreetingsController {

	private static final Logger logger= LoggerFactory.getLogger(GreetingsController.class);
	
	@Autowired
	IGreetingsService service;
	
	@GetMapping("/gr")
	public String greetingMessage(Map<String, Object> model) {
		logger.debug("Control is in /gr");
		model.put("greet", service.greeting());
		logger.info("Control is in /gr");
		return "greet";
	}
	
	@GetMapping("/greet")
	public Map<String,Object> greetingMessages() {
		Map<String, Object> map=new HashMap<>();
		logger.info("control just created hashmap");
		String greet=service.greeting();
		logger.debug("control is in developing the service methods");
		map.put("greet", greet);
		return map;
	}
	@GetMapping("/tourist")
	public String savingTourist(){
		logger.info("control just created Tourist Get-controller");
		
		return "/tourist-post";
	}
	@PostMapping("/tourist-post")
	public String savingTourists(Map<String,Object> model){
		logger.info("control just created Tourist controller");
		Tourists tourist=new Tourists(101,"Akhil","Gold",599.99);
		String message = service.saveData(tourist);
		model.put("message", message);
		return "greet";
	}
}
