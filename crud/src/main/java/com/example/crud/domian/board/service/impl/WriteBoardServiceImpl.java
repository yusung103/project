package com.example.crud.domian.board.service.impl;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.WriteBoardService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class WriteBoardServiceImpl implements WriteBoardService {

    private final BoardRepository boardRepository;


    public void execute(BoardRequest writeBoardRequest) {
        Board board = Board.builder()
                .title(writeBoardRequest.getTitle())
                .content(writeBoardRequest.getContent())
                .build();

        boardRepository.save(board);
    }
}
