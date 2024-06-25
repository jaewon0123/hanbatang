package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbatang.dto.Member;
import com.hanbatang.service.MemberService;


import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Controller //db와 templates를 연결해주는 연결고리
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String registerForm(Model model) {
		model.addAttribute("mem", new Member());
		return "index";
	}
}
