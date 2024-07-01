package com.hanbatang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainPageController {

	
	@GetMapping("/")
	public String mainPage() {
		return "mainPage";
	}
	
	@GetMapping("mainPage")
	public String mainPageHome() {
		return "mainPage";
	}
	
	@GetMapping("chatbot")
	public String chatbot() {
		return "chatbot";
	}

	

}
