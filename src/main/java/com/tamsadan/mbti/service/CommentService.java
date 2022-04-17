package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Comment;
import com.tamsadan.mbti.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Long join(Long postId, Long memberId, String content, LocalDateTime time, Integer likeCount){
        Comment comment = Comment.builder()
                .postId(postId)
                .memberId(memberId)
                .content(content)
                .time(time)
                .likeCount(likeCount)
                .build();
        commentRepository.save(comment);
        return comment.getId();
    }

}
