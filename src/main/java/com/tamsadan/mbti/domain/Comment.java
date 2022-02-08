package com.tamsadan.mbti.domain;

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
    private Long id;
    private Long postId;
    private Long memberId;
    private String content;
    private LocalDateTime time;
    private Integer likeCount;

    @Builder
    public Comment(Long postId, Long memberId, String content, LocalDateTime time, Integer likeCount) {
        this.postId = postId;
        this.memberId = memberId;
        this.content = content;
        this.time = time;
        this.likeCount = likeCount;
    }
}
