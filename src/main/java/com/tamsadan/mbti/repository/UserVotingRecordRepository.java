package com.tamsadan.mbti.repository;

import com.tamsadan.mbti.domain.UserVotingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVotingRecordRepository extends JpaRepository<UserVotingRecord, Long> {
}
