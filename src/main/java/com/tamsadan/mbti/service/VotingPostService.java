package com.tamsadan.mbti.service;

import com.tamsadan.mbti.repository.VotingPostRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class VotingPostService {
    private final VotingPostRepository votingPostRepository;

    public VotingPostService(VotingPostRepository votingPostRepository) {
        this.votingPostRepository = votingPostRepository;
    }

}
