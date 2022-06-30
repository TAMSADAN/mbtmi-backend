package com.tamsadan.mbti.service.Post;

import com.tamsadan.mbti.domain.Post.Comment;
import com.tamsadan.mbti.repository.Post.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

}
