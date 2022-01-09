package com.lafin.mpt.application.service;

import com.lafin.mpt.domain.entity.member.Member;
import com.lafin.mpt.domain.usecase.MemberLoginUseCase;
import com.lafin.mpt.infrastructure.mysqlpersistence.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService, MemberLoginUseCase {

    private final MemberRepository memberRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public BCryptPasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var member = memberRepository.findByEmail(email);
        Objects.requireNonNull(member);

        return null;
    }

    @Override
    public Member login(String email, String password) {
        return null;
    }
}
