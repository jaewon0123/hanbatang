package com.hanbatang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanbatang.dto.Board;
import com.hanbatang.service.BoardService;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String getAllPosts(Model model) {
		List<Board> board = boardService.getAllPost();
		model.addAttribute("board", board);
		return "board";
	}
	

	
	/*
	@PostMapping("/")
	public String getLogin(Model model,
					@RequestParam("member_id") String member_id,
					@RequestParam("member_pw") String member_pw,
					HttpSession session) {
		
		
	}
		*/	
}
