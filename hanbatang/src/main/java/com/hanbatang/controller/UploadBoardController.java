package com.hanbatang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hanbatang.dto.Board;
import com.hanbatang.service.BoardService;

@Controller
public class UploadBoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/uploadBoard")
	public String uploadBoard(Model model) {
		
		model.addAttribute("board", new Board());
		return "uploadBoard";
	}
	
	@PostMapping("/posting")
	public String insertBoard(Board board, Model model) {
		boardService.insertBoard(board);
		List<Board> boardList = boardService.getAllPost();
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
}
