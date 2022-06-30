package com.tamsadan.mbti.domain.Post;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@DiscriminatorValue("P")
public class PlainPost extends Post{

    public PlainPost(Long userId, String title, String content) {
        super(userId, title, content);
    }
}
