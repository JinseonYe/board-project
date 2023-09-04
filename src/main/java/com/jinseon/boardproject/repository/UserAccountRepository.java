package com.jinseon.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinseon.boardproject.domain.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
