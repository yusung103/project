package com.example.crud.domian.board.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor
public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
//    private String writer;
//    private String createdDate;
//    private String modifiedDate;
//    private int view;

//    public BoardResponseDto (Board board){
//
//        BoardResponseDto.builder()
//                .id(board.getId())
//                .title(board.getTitle())
//                .content(board.getContent())
//                .writer(board.getWriter())
//                .createdDate(board.getCreatedDate())
//                .modifiedDate(board.getModifiedDate())
//                .view(board.getView())
//                .comments(board.getComments().stream().map(CommentResponseDto::new).collect(Collectors.toList()))
//                .build();
//    }
}
