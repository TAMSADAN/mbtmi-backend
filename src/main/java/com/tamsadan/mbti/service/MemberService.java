package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Member;
import com.tamsadan.mbti.repository.MemberRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
    public List<Member> findAll(){
        return memberRepository.findAll();
    }
    public Optional<Member> findMemberByLoginToken(String loginToken){
        return memberRepository.findByLoginToken(loginToken);
    }
}
