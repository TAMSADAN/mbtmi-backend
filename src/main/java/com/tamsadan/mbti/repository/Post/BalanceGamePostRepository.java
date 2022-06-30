package com.tamsadan.mbti.repository.Post;

import com.tamsadan.mbti.domain.Post.BalanceGamePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceGamePostRepository extends JpaRepository<BalanceGamePost, String> {
}
