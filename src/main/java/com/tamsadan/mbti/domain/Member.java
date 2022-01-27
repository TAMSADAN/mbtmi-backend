package com.tamsadan.mbti.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mbti;
    private String loginToken;

    @Builder
    public Member(String name, String mbti, String loginToken) {
        this.name = name;
        this.mbti = mbti;
        this.loginToken = loginToken;
    }
}
