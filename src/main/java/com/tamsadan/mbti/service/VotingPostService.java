package com.tamsadan.mbti.service;

import com.tamsadan.mbti.repository.Post.VotingPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class VotingPostService {
    private final VotingPostRepository votingPostRepository;

}
