package com.hanbatang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String mainPage() {
		return "mainPage";
	}
<<<<<<< HEAD
=======
	
	@GetMapping("/wayToMarket")
	public String showMarketGuide() {
		return "MarketGuide";
	}
	
	@GetMapping("/introCompany")
	public String showIntroCompany() {
		return "introCompany";
	}
	
	@GetMapping("/beefInfo")
	public String showBeefInfo() {
		return "beefKindsInfo";
	}
	
	@GetMapping("/memberSignUp")
	public String showSignUp() {
		return "member-register";
	}
>>>>>>> ea6376fae432c22f543769a282e62c40ba445cf7
}
