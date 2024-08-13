package com.example.crud.domian.board.service.impl;

import com.example.crud.domian.board.dto.response.BoardResponseDto;
import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.exception.BoardNotFoundException;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.GetBoardService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class GetBoardServiceImpl implements GetBoardService {

    private final BoardRepository boardRepository;
    public BoardResponseDto execute(Long id){
        Board board = boardRepository.findById(id).orElseThrow(BoardNotFoundException::new);

        return BoardResponseDto.builder()
                .id(board.getId())
                .title(board.getTitle())
                .content(board.getContent())
                .build();
    }
}
