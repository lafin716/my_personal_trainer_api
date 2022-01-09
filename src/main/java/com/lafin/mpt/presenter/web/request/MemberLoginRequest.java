package com.lafin.mpt.presenter.web.request;

import lombok.Data;

@Data
public class MemberLoginRequest {

    private String email;

    private String password;
}
