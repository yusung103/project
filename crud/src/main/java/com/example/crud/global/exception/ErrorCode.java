package com.example.crud.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    BOARD_NOT_FOUND(404, "해당 board를 찾을 수 없습니다"),
    MEMBER_NOT_FOUND(404, "해당 member를 찾을 수 없습니다");


    private final int httpStatus;
    private final String message;
}
