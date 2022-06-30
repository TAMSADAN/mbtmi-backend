package com.tamsadan.mbti.repository.Post;

import com.tamsadan.mbti.domain.Post.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, String> {
    Slice<Post> findSliceBy(Pageable pageable);
}
