package com.tamsadan.mbti.repository.Post;

import com.tamsadan.mbti.domain.Post.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
