package com.project.board.web.Board.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor //사용되지 않은 모든 @NonNull, final 파라미터 생성자 생성
public class BoardDto {
	
	@NonNull
	private int one;
	private int two;
	private int three;
	private final int four;
	
	
	 

}
