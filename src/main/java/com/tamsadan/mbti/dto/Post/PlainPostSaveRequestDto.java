package com.tamsadan.mbti.dto.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PlainPostSaveRequestDto {
    private String userId;
    private String title;
    private String content;
}
