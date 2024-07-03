package com.hanbatang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hanbatang.dto.Board;
import com.hanbatang.dto.Members;
import com.hanbatang.service.BoardService;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String getAllPosts(Model model, HttpSession session) {
		Members member = (Members) session.getAttribute("loginSession");
		
		List<Board> board = boardService.getAllPost();
		model.addAttribute("board", board);
		return "board";
	}

}
