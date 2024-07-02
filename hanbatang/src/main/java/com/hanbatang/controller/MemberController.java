package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hanbatang.dto.Member;
import com.hanbatang.service.MemberService;

import jakarta.mail.Session;
import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	

	@GetMapping("/memberSign")
	public String registerForm(Model model) {
		model.addAttribute("mem", new Member());
		return "/memberSign";
	}
	
	@PostMapping("/register")
	public String insertMember(Member member, HttpSession session, Model model) {
	    // 회원가입 로직
	    memberService.insertMember(member);

	    model.addAttribute("msg", "한바탕 회원가입을 축하합니다!");
        //회원가입을 한 내용을 로긴 세션을 사용해서 유지한 상태로
	    session.setAttribute("loginSession", member);

	    // 메인 페이지로 리디렉션
	    return "success";
	}

	
	
}