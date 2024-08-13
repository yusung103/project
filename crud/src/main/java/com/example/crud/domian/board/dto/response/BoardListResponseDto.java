package com.example.crud.domian.board.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardListResponseDto {
    private Long id;
    private String title;
}
