package com.alyssajordev.jobportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alyssajordev.jobportal.entity.Users;


public interface UsersRepository extends JpaRepository<Users, Integer>{
    
    Optional<Users> findByEmail(String email);
}
