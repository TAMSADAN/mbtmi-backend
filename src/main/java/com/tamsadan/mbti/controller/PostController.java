package com.tamsadan.mbti.controller;

import com.tamsadan.mbti.domain.Post.Post;
import com.tamsadan.mbti.dto.Post.PostFindDto;
import com.tamsadan.mbti.service.Post.PostService;
import com.tamsadan.mbti.service.User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/post")
public class PostController {
    private final PostService postService;
    @GetMapping(value = "/list")
    @ResponseBody
    public Slice<Post> findAll(@RequestBody PostFindDto postFindDto){
        return postService.findSlice(postFindDto.getPage_index(), postFindDto.getSize());
    }

}
