package com.example.crud.domian.board.service.impl;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.exception.BoardNotFoundException;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.UpdateBoardService;
import com.example.crud.global.exception.CustomException;
import com.example.crud.global.exception.ErrorCode;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class UpdateBoardServiceImpl implements UpdateBoardService {
    private final BoardRepository boardRepository;
    @Override
    public void execute(BoardRequest boardRequest, Long id) {
        Board board = boardRepository.findById(id).orElseThrow(BoardNotFoundException::new);
         board.update(boardRequest);
         boardRepository.save(board);
    }
}
