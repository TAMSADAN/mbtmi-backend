package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.VotingPost;
import com.tamsadan.mbti.repository.VotingPostRepository;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Map;

@Transactional
public class VotingPostService {
    private final VotingPostRepository votingPostRepository;

    public VotingPostService(VotingPostRepository votingPostRepository) {
        this.votingPostRepository = votingPostRepository;
    }
    public Long join(Long memberId, String title, Map<String, Integer> content, Integer likeCount, Time time){
        VotingPost votingPost = VotingPost.builder()
                .memberId(memberId)
                .title(title)
                .content(content)
                .likeCount(likeCount)
                .time(time)
                .build();
        votingPostRepository.save(votingPost);
        return votingPost.getId();
    }
}
