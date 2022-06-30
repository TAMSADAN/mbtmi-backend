package com.tamsadan.mbti.repository.Post;

import com.tamsadan.mbti.domain.Post.PlainPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlainPostRepository extends JpaRepository<PlainPost, String> {
}
