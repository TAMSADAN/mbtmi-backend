package com.tamsadan.mbti.repository;

import com.tamsadan.mbti.domain.PlainPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlainPostRepository extends JpaRepository<PlainPost, Long> {
}
