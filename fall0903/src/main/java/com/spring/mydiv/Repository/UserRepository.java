package com.spring.mydiv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mydiv.Entity.User;

/**
 * @author 12nov
 */
public interface UserRepository extends JpaRepository<User, Long>{
	/*
    Optional<User> findByMemberId(String memberId);

    List<User> findDevelopersByStatusEquals(StatusCode status);
    */
}
