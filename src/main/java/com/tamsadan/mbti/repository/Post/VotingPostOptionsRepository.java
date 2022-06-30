package com.tamsadan.mbti.repository.Post;

import com.tamsadan.mbti.domain.Post.VotingPostOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingPostOptionsRepository extends JpaRepository<VotingPostOptions, Long> {
}
