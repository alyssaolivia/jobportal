package com.alyssajordev.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alyssajordev.jobportal.entity.UsersType;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer>{
    
}
