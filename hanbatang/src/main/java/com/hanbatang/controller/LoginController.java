package com.hanbatang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/findId")
	public String findIdPage() {
		return "findId";
	}
	@GetMapping("/findPw")
	public String findPwPage() {
		return "findPw";
	}
}
