package com.example.crud.domian.board.controller;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.dto.response.BoardListResponseDto;
import com.example.crud.domian.board.dto.response.BoardResponseDto;
import com.example.crud.domian.board.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final WriteBoardService writeBoard;
    private final DeleteBoardService deleteBoard;
    private final GetBoardListService getBoardList;
    private final GetBoardService getBoard;
    private final UpdateBoardService updateBoard;

    /** 글 작성 */
    @PostMapping("/write")
    public ResponseEntity<Void> write(@RequestBody BoardRequest writeBoardRequest){
        writeBoard.execute(writeBoardRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /** 모든 글 불러오기 */
    @GetMapping("/list")
    public ResponseEntity<List<BoardListResponseDto>> getList(){
        List<BoardListResponseDto> responses = getBoardList.execute();
        return ResponseEntity.ok(responses);
    }

    /** 글 하나 불러오기 */
    @GetMapping("/{id}")
    public ResponseEntity<BoardResponseDto> getOne(@PathVariable Long id){
        BoardResponseDto response = getBoard.execute(id);
        return ResponseEntity.ok(response);
    }

    /** 글 수정 */
    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateBoard(@PathVariable Long id, @RequestBody BoardRequest boardRequest){
        updateBoard.execute(boardRequest, id);
        return ResponseEntity.noContent().build();
    }

    /** 글 삭제 */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        deleteBoard.execute(id);
        return ResponseEntity.noContent().build();
    }
}
