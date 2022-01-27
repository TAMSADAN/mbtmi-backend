package com.tamsadan.mbti.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

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
    private Time time;

    @Builder
    public Post(Long memberId, String title, String content, Integer likeCount, Time time) {
        this.memberId = memberId;
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.time = time;
    }
}
