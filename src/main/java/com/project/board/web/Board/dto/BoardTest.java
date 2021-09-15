package com.project.board.web.Board.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardTest {
	
	@RequestMapping("/test")
	public String constructT() {
		BoardDto bt = new BoardDto(1, 4); //
		bt.getFour();
		bt.setTwo(2);

		return "";
	}
}
