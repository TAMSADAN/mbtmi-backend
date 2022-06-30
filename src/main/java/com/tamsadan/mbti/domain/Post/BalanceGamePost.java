package com.tamsadan.mbti.domain.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("B")
public class BalanceGamePost extends Post{
    public BalanceGamePost(String userId, String title) {
        super(userId, title, "");
    }
}
