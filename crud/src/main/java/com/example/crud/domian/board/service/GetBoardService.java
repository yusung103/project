package com.example.crud.domian.board.service;

import com.example.crud.domian.board.dto.response.BoardResponseDto;

public interface GetBoardService {
    BoardResponseDto execute(Long id);
}
