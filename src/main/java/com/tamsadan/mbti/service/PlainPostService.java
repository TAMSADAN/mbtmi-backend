package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Post.PlainPost;
import com.tamsadan.mbti.repository.Post.PlainPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PlainPostService {
    private final PlainPostRepository plainPostRepository;
    public List<PlainPost> getPlainPostList(){
        return plainPostRepository.findAll();
    }
    public Optional<PlainPost> getPlainPostById(Long id){
        return plainPostRepository.findById(id);
    }
    public void joinPlainPost(PlainPost plainPost){
        plainPostRepository.save(plainPost);
    }
}
