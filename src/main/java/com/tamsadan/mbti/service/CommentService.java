package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.Comment;
import com.tamsadan.mbti.repository.CommentRepository;

import javax.transaction.Transactional;
import java.sql.Time;

@Transactional
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public Long join(Long postId, Long memberId, String content, Time time, Integer likeCount){
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
