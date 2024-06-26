package com.hanbatang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.Board;
import com.hanbatang.mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	public List<Board> getAllPost(){
		return boardMapper.getAllPost();
	}
	
	public void insertBoard(Board board) {
		boardMapper.insertBoard(board);
	}
}
