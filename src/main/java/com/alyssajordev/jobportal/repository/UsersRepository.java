package com.alyssajordev.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alyssajordev.jobportal.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
    
}
