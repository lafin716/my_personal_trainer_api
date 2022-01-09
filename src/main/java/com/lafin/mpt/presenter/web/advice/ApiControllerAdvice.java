package com.lafin.mpt.presenter.web.advice;

import com.lafin.mpt.presenter.web.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<BaseResponse> nullException(NullPointerException exception) {

        var responseBody = BaseResponse.builder()
                .status(HttpStatus.BAD_REQUEST)
                .message("없다.")
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

}
