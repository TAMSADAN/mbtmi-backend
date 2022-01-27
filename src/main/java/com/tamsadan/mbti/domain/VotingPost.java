package com.tamsadan.mbti.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Map;

@Entity
@Getter
@NoArgsConstructor
public class VotingPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long memberId;
    private String title;
    @ElementCollection
    private Map<String, Integer> content;
    private Integer likeCount;
    private Time time;

    @Builder
    public VotingPost(Long memberId, String title, Map<String, Integer> content, Integer likeCount, Time time) {
        this.memberId = memberId;
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.time = time;
    }
}
