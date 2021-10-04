package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery) {
		if (searchQuery == null) {
			return "Hello Human";
		} else {
			return "Hello " + searchQuery;
		}
	}
	
}
