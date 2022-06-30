package com.tamsadan.mbti.service.User;

import com.tamsadan.mbti.repository.User.UserLikeRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserLikeRecordService {
    private final UserLikeRecordRepository userLikeRecordRepository;
}
