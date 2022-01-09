package com.lafin.mpt.domain.usecase;

import com.lafin.mpt.domain.entity.member.Member;

public interface MemberLoginUseCase {

    Member login(String email, String password);
}
