package com.tamsadan.mbti.repository.User;

import com.tamsadan.mbti.domain.User.UserLikeRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLikeRecordRepository extends JpaRepository<UserLikeRecord, Long> {
}
