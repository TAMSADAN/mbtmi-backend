package com.tamsadan.mbti.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@DiscriminatorValue("P")
public class PlainPost extends Post{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public PlainPost(Long memberId, String title, String content, Integer likeCount, LocalDateTime time, int commentCnt) {
        super(memberId, title, content, likeCount, time, commentCnt);
    }
}
