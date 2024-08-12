package com.alyssajordev.jobportal.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alyssajordev.jobportal.entity.RecruiterProfile;
import com.alyssajordev.jobportal.repository.RecruiterProfileRepository;

@Service
public class RecruiterProfileService {

    private final RecruiterProfileRepository recruiterProfileRepository;

    public RecruiterProfileService(RecruiterProfileRepository recruiterProfileRepository){
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    public Optional<RecruiterProfile> getOne(Integer id){
        return recruiterProfileRepository.findById(id);
    }

    public RecruiterProfile addNew(RecruiterProfile recruiterProfile) {
        return recruiterProfileRepository.save(recruiterProfile);
    }
}
