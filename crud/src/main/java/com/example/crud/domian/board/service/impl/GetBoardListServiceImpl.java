package com.example.crud.domian.board.service.impl;

import com.example.crud.domian.board.dto.response.BoardListResponseDto;
import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.GetBoardListService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class GetBoardListServiceImpl implements GetBoardListService {

    private final BoardRepository boardRepository;

    public List<BoardListResponseDto> execute() {
            List<Board> boardList = boardRepository.findAll();

            return boardList.stream()
                    .map(Board::toDto)
                    .collect(Collectors.toList());
    }
}
