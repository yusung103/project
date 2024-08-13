package com.example.crud.domian.board.service.impl;
import com.example.crud.domian.board.exception.BoardNotFoundException;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.DeleteBoardService;
import com.example.crud.global.exception.CustomException;
import com.example.crud.global.exception.ErrorCode;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class DeleteBoardServiceImpl implements DeleteBoardService {

    private final BoardRepository boardRepository;

    public void execute(Long id){
        boardRepository.findById(id).orElseThrow(BoardNotFoundException::new);

        boardRepository.deleteById(id);
    }
}
