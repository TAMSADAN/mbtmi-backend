package com.tamsadan.mbti.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Long memberId;
    protected String title;
    protected String content;
    protected Integer likeCount;
    protected LocalDateTime time;
    protected int commentCnt;

    public Post(Long memberId, String title, String content, Integer likeCount, LocalDateTime time, int commentCnt) {
        this.memberId = memberId;
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.time = time;
        this.commentCnt = commentCnt;
    }
}
