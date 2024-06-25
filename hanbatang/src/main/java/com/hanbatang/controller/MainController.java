package com.hanbatang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String mainPage() {
		return "mainPage";
	}
	
	@GetMapping("/wayToMarket")
	public String showMarketGuide() {
		return "MarketGuide";
	}
}
