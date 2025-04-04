package com.simpleSpringBoot.FirstWebApp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
/*@Controller is annotation used for java class HomeController to act as actual controller and 
it will look for html template
*@restController it will display output without looking for any templates*/
public class HomeController {
	
	@GetMapping({" ","/"})
	public String home() {
		return "home";
	}
	
	

}
