package com.hanbatang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Controller
public class registermemberController {
	@GetMapping("/")
	public String registerMember() {
		return "registerMember";
	}
}
