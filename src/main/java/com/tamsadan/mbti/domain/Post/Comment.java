package com.tamsadan.mbti.domain.Post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_id;
    private Long postId;
    private Long userId;
    private Long parentId;
    private String content;
    private String time;
    private Integer likeCount;

    public Comment(Long postId, Long userId, Long parentId, String content, Integer likeCount) {
        this.postId = postId;
        this.userId = userId;
        this.parentId = parentId;
        this.content = content;
        this.time = LocalDateTime.now().toString();
        this.likeCount = likeCount;
    }
}
