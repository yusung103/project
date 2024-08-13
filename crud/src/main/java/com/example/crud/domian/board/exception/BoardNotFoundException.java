package com.example.crud.domian.board.exception;

import com.example.crud.global.exception.CustomException;
import com.example.crud.global.exception.ErrorCode;

public class BoardNotFoundException extends CustomException {

    public BoardNotFoundException() {
        super(ErrorCode.BOARD_NOT_FOUND);
    }
}
