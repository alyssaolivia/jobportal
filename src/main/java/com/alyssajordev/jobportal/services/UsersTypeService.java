package com.alyssajordev.jobportal.services;

import org.springframework.stereotype.Service;

import com.alyssajordev.jobportal.repository.UsersTypeRepository;
import com.alyssajordev.jobportal.entity.UsersType;
import java.util.List;

@Service
public class UsersTypeService {
    
    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
