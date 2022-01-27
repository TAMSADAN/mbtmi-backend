package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Member;
import com.tamsadan.mbti.repository.MemberRepository;

import javax.transaction.Transactional;

@Transactional
public class MemberService {
    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    public Long join(String name, String mbti, String loginToken){
        Member member = Member.builder()
                .mbti(mbti)
                .loginToken(loginToken)
                .name(name)
                .build();
        memberRepository.save(member);
        return member.getId();
    }
}
