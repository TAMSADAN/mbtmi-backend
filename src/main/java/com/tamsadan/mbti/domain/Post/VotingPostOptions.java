package com.tamsadan.mbti.domain.Post;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class VotingPostOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String postId;
    private String votingOption;
}
