package com.lafin.mpt.presenter.web.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class BaseResponse {

    private HttpStatus status;

    private String message;
}
