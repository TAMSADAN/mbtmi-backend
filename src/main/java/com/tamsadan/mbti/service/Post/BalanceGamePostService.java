package com.tamsadan.mbti.service.Post;

import com.tamsadan.mbti.repository.Post.BalanceGamePostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BalanceGamePostService {
    private final BalanceGamePostRepository balanceGamePostRepository;
}
