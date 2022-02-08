package com.tamsadan.mbti.controller;

import com.tamsadan.mbti.domain.Member;
import com.tamsadan.mbti.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping(value = "api/members/list")
    @ResponseBody
    public List<Member> retrieveMemberList(){
        return memberService.findAll();
    }

    @GetMapping(value = "api/members/{loginToken}")
    @ResponseBody
    public Optional<Member> retrieveMember(@PathVariable String loginToken){
        return memberService.findMemberByLoginToken(loginToken);
    }

    @PostMapping(value = "api/members/join")
    @ResponseBody
    public Member joinMember(@RequestBody Member member){
        memberService.join(member.getName(), member.getMbti(), member.getLoginToken());
        return member;
    }
}
