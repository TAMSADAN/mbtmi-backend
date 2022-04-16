package com.tamsadan.mbti.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class VotingPostOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String voting_option;
    @OneToMany
    private List<VotingPostResults> votingPostResults;
}
