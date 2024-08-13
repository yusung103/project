package com.example.crud.domian.board.service;

import com.example.crud.domian.board.dto.response.BoardListResponseDto;

import java.util.List;

public interface GetBoardListService {
    List<BoardListResponseDto> execute();
}
