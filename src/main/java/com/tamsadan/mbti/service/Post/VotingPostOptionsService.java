package com.tamsadan.mbti.service.Post;

import com.tamsadan.mbti.repository.Post.VotingPostOptionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class VotingPostOptionsService {
    private final VotingPostOptionsRepository votingPostOptionsRepository;
}
