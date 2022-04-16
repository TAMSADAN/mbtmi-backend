package com.tamsadan.mbti.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("V")
public class VotingPost extends Post{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<VotingPostOptions> votingPostOptions;

    public VotingPost(Long id, List<VotingPostOptions> votingPostOptions) {
        this.id = id;
        this.votingPostOptions = votingPostOptions;
    }

    public VotingPost(Long memberId, String title, String content, Long id, List<VotingPostOptions> votingPostOptions) {
        super(memberId, title, content, 0, LocalDateTime.now(), 0);
        this.id = id;
        this.votingPostOptions = votingPostOptions;
    }
}
