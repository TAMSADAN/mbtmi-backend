package com.tamsadan.mbti.config;

import com.tamsadan.mbti.repository.Post.CommentRepository;
import com.tamsadan.mbti.repository.User.UserRepository;
import com.tamsadan.mbti.repository.Post.PostRepository;
import com.tamsadan.mbti.repository.Post.VotingPostRepository;
import com.tamsadan.mbti.service.Post.CommentService;
import com.tamsadan.mbti.service.User.UserService;
import com.tamsadan.mbti.service.Post.PostService;
import com.tamsadan.mbti.service.Post.VotingPostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final VotingPostRepository votingPostRepository;
    private final CommentRepository commentRepository;

    public SpringConfig(UserRepository userRepository, PostRepository postRepository, VotingPostRepository votingPostRepository, CommentRepository commentRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.votingPostRepository = votingPostRepository;
        this.commentRepository = commentRepository;
    }

    @Bean
    public UserService userService(){
        return new UserService(userRepository);
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
