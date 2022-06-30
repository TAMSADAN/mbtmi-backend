package com.tamsadan.mbti.service.User;

import com.tamsadan.mbti.domain.User.User;
import com.tamsadan.mbti.repository.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User save(String userId, String mbti){
        return userRepository.save(new User(userId, mbti));
    }
}

