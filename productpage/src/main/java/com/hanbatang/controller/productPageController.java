package com.hanbatang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class productPageController {
	@GetMapping("/")
	public String registerMember() {
		return "productPage";
	}
}
