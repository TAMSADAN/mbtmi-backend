package com.tamsadan.mbti.domain.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("V")
public class VotingPost extends Post{
    public VotingPost(String userId, String title, String content) {
        super(userId, title, content);
    }
}
