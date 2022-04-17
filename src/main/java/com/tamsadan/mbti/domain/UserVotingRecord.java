package com.tamsadan.mbti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserVotingRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long userId;
    Long postId;
    String votingOption;

    public UserVotingRecord(Long userId, Long postId, String votingOption){
        this.userId = userId;
        this.postId = postId;
        this.votingOption = votingOption;
    }
}
