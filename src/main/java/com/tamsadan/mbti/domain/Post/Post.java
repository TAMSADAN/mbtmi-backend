package com.tamsadan.mbti.domain.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Post {
    @Id
    protected String postId;
    protected String userId;
    protected String title;
    protected String content;
    protected Integer likeCount;
    protected String time;
    protected int commentCnt;
    protected int viewCnt;

    public Post(String userId, String title, String content) {
        this.postId = UUID.randomUUID().toString().substring(0, 8);
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.likeCount = 0;
        this.time = LocalDateTime.now().toString();
        this.commentCnt = 0;
        this.viewCnt = 0;
    }
}
