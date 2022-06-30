package com.tamsadan.mbti.controller;

import com.tamsadan.mbti.domain.Post.Post;
import com.tamsadan.mbti.service.Post.PostService;
import com.tamsadan.mbti.service.User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/post")
public class PostController {
    private final PostService postService;
}
