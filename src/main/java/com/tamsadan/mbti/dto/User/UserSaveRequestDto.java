package com.tamsadan.mbti.dto.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserSaveRequestDto {
    private String userId;
    private String mbti;
}
