package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Post;
import com.tamsadan.mbti.repository.PostRepository;

import javax.transaction.Transactional;
import java.sql.Time;

@Transactional
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public Long join(Long memberId, String title, String content, Integer likeCount, Time time){
        Post post = Post.builder()
                .memberId(memberId)
                .title(title)
                .content(content)
                .likeCount(likeCount)
                .time(time)
                .build();
        postRepository.save(post);
        return post.getId();
    }
}
