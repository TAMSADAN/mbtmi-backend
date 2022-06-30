package com.tamsadan.mbti.controller;

import com.tamsadan.mbti.domain.User.User;
import com.tamsadan.mbti.dto.User.UserSaveRequestDto;
import com.tamsadan.mbti.service.User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping(value="/api/v1/user")
public class UserController {
    private final UserService userService;
    @PostMapping(value = "/")
    @ResponseBody
    public User save(@RequestBody UserSaveRequestDto userSaveRequestDto){
        return userService.save(userSaveRequestDto.getUserId(), userSaveRequestDto.getMbti());
    }

}
