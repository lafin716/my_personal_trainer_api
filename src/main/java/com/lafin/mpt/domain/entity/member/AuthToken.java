package com.lafin.mpt.domain.entity.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthToken {

    private String username;

    private String email;

    private String token;

    private Collection authorities;
}
