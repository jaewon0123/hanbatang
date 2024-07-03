package com.hanbatang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hanbatang.dto.Board;

@Mapper
public interface BoardMapper {
	List<Board> getAllPost();

	void insertBoard(Board board);
	
	public void uploadPost(Board board);
	
	Board getBoardById(int board_no);
	
	
	
}

