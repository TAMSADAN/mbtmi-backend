package com.tamsadan.mbti.service.Post;

import com.tamsadan.mbti.domain.Post.Post;
import com.tamsadan.mbti.repository.Post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

}
