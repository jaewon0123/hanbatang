package com.hanbatang.controller;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> kimjaewon-productpage
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD

import com.hanbatang.dto.Board;
import com.hanbatang.dto.Members;
import com.hanbatang.service.BoardService;

import jakarta.servlet.http.HttpSession;

=======
import org.springframework.web.bind.annotation.RequestParam;

import com.hanbatang.dto.Board;
import com.hanbatang.service.BoardService;

>>>>>>> kimjaewon-productpage
@Controller
public class UploadBoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/uploadBoard")
	public String uploadBoard(Model model) {
		
		model.addAttribute("board", new Board());
		return "uploadBoard";
	}
<<<<<<< HEAD

	
	@PostMapping("/posting")
	public String insertBoard(Board newBoard, Model model, HttpSession session) {
		
		Members member = (Members) session.getAttribute("loginSession");
		boardService.uploadPost(member.getMember_no(), member.getMember_name(), member.getMember_nickname(), newBoard);
		
		return "redirect:/board";
=======
	
	@PostMapping("/posting")
	public String insertBoard(Board board, Model model) {
		boardService.insertBoard(board);
		List<Board> boardList = boardService.getAllPost();
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	
	
	
	
	@GetMapping("/uploadPost")
	public String uploadPost(Model model) {
		model.addAttribute("p", new Board());
		return "boardList";
	}
	
	@PostMapping("/uploadPost")
	public String uploadPig(
			@RequestParam ("member_no") int member_no,
			@RequestParam("member_name") String member_name,
			@RequestParam("member_nickname") String member_nickname,
			Model model) {
		boardService.uploadPost(member_no, member_name, member_nickname);
		return "boardList";
>>>>>>> kimjaewon-productpage
	}
	
}
