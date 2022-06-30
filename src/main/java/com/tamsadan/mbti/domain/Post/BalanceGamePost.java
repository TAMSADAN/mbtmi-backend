package com.tamsadan.mbti.domain.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("B")
public class BalanceGamePost extends Post{
    public BalanceGamePost(Long userId, String title) {
        super(userId, title, "");
    }
}
