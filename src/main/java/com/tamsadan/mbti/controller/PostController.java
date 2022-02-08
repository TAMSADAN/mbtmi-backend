package com.tamsadan.mbti.controller;

import com.tamsadan.mbti.domain.Post;
import com.tamsadan.mbti.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    @PostMapping(value = "api/posts/join")
    @ResponseBody
    public Post joinPost(@RequestBody Post post){
        postService.join(post.getMemberId(), post.getTitle(), post.getContent(), 0, LocalDateTime.now());
        return post;
    }
    @GetMapping(value = "api/posts/list")
    @ResponseBody
    public List<Post> retrievePostList(){
        return postService.findAll();
    }
    @GetMapping(value = "api/posts/{postId}")
    @ResponseBody
    public Optional<Post> retrievePost(@PathVariable Long postId){
        return postService.findById(postId);
    }
}
