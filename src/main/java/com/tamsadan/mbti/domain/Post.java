package com.tamsadan.mbti.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long memberId;
    private String title;
    private String content;
    private Integer likeCount;
    private LocalDateTime time;

    @Builder
    public Post(Long memberId, String title, String content, Integer likeCount, LocalDateTime time) {
        this.memberId = memberId;
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.time = time;
    }
}
