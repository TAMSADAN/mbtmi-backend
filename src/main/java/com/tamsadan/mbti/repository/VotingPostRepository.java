package com.tamsadan.mbti.repository;

import com.tamsadan.mbti.domain.Post.VotingPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingPostRepository extends JpaRepository<VotingPost, Long> {
}
