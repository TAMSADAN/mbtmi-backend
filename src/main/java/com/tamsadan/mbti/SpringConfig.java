package com.tamsadan.mbti;

import com.tamsadan.mbti.repository.CommentRepository;
import com.tamsadan.mbti.repository.MemberRepository;
import com.tamsadan.mbti.repository.PostRepository;
import com.tamsadan.mbti.repository.VotingPostRepository;
import com.tamsadan.mbti.service.CommentService;
import com.tamsadan.mbti.service.MemberService;
import com.tamsadan.mbti.service.PostService;
import com.tamsadan.mbti.service.VotingPostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;
    private final PostRepository postRepository;
    private final VotingPostRepository votingPostRepository;
    private final CommentRepository commentRepository;

    public SpringConfig(MemberRepository memberRepository, PostRepository postRepository, VotingPostRepository votingPostRepository, CommentRepository commentRepository) {
        this.memberRepository = memberRepository;
        this.postRepository = postRepository;
        this.votingPostRepository = votingPostRepository;
        this.commentRepository = commentRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }
    @Bean
    public PostService postService(){
        return new PostService(postRepository);
    }
    @Bean
    public VotingPostService votingPostService(){
        return new VotingPostService(votingPostRepository);
    }
    @Bean
    public CommentService commentService(){
        return new CommentService(commentRepository);
    }
}
