package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Post;
import com.tamsadan.mbti.repository.PostRepository;

import javax.transaction.Transactional;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Transactional
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public Long join(Long memberId, String title, String content, Integer likeCount, LocalDateTime time){
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
    public List<Post> findAll(){
        return postRepository.findAll();
    }
    public Optional<Post> findById(Long id){
        return postRepository.findById(id);
    }
}
