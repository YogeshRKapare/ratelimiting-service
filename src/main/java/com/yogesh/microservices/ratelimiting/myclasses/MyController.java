package com.yogesh.microservices.ratelimiting.myclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@Autowired
	MyConfigurations configurations;
	
	
	@GetMapping("/mylimit")
	public MyConfigurations getConfigs() {
	
		return configurations;
	}

}
