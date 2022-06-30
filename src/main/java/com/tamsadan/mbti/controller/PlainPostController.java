package com.tamsadan.mbti.controller;

import com.tamsadan.mbti.domain.Post.PlainPost;
import com.tamsadan.mbti.dto.Post.PlainPostSaveRequestDto;
import com.tamsadan.mbti.service.Post.PlainPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/post/plain")
public class PlainPostController {
    private final PlainPostService plainPostService;
    @PostMapping(value="/")
    @ResponseBody
    public PlainPost save(@RequestBody PlainPostSaveRequestDto plainPostSaveRequestDto){
        return plainPostService.save(plainPostSaveRequestDto.getUserId(), plainPostSaveRequestDto.getTitle(), plainPostSaveRequestDto.getContent());
    }
}
