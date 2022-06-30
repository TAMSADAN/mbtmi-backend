package com.tamsadan.mbti.service.Post;

import com.tamsadan.mbti.domain.Post.Post;
import com.tamsadan.mbti.repository.Post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public List<Post> findAll(){
        return postRepository.findAll();
    }
    public Slice<Post> findSlice(int page_index, int size){
        return postRepository.findSliceBy(PageRequest.of(page_index, size));
    }
}
