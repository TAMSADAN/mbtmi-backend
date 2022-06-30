package com.tamsadan.mbti.controller;

import com.tamsadan.mbti.service.Post.VotingPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/voting-post")
public class VotingPostController {
    private final VotingPostService votingPostService;


}
