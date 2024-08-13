package com.example.crud.domian.board.service;

import com.example.crud.domian.board.dto.request.BoardRequest;

public interface WriteBoardService {
    void execute(BoardRequest writeBoardRequest);
}
