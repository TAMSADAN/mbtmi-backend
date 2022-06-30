package com.tamsadan.mbti.service;

import com.tamsadan.mbti.domain.User.User;
import com.tamsadan.mbti.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(String userSeq) {
        return userRepository.findByUserId(userSeq);
    }
    public User joinUser(User user){
        userRepository.save(user);
        return user;
    }
    public void deleteUserByUserSeq(Long userSeq){
        userRepository.deleteById(userSeq);
    }
}

