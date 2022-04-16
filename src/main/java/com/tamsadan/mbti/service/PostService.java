package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Post;
import com.tamsadan.mbti.repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public List<Post> findAll(){
        return postRepository.findAll();
    }
    public Optional<Post> findById(Long id){
        return postRepository.findById(id);
    }
    public List<Post> findByMemberId(Long memberId){
        return postRepository.findAllByMemberId(memberId);
    }
    public Post joinPost(Post post){
        postRepository.save(post);
        return post;
    }
}
