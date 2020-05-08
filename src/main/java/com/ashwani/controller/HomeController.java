package com.ashwani.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String homePage() {
		return "Welcome To Git Hub Project With Jenkins";
	}
}
