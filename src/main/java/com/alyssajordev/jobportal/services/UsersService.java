package com.alyssajordev.jobportal.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.alyssajordev.jobportal.entity.JobSeekerProfile;
import com.alyssajordev.jobportal.entity.RecruiterProfile;
import com.alyssajordev.jobportal.entity.Users;
import com.alyssajordev.jobportal.repository.JobSeekerProfileRepository;
import com.alyssajordev.jobportal.repository.RecruiterProfileRepository;
import com.alyssajordev.jobportal.repository.UsersRepository;

@Service
public class UsersService {
    
    private final UsersRepository usersRepository;
    private final JobSeekerProfileRepository jobSeekerProfileRepository;
    private final RecruiterProfileRepository recruiterProfileRepository;

    public UsersService(UsersRepository usersRepository, JobSeekerProfileRepository jobSeekerProfileRepository, RecruiterProfileRepository recruiterProfileRepository) {
        this.usersRepository = usersRepository;
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    public Users addNew(Users users) {
        users.setActive(true);
        users.setRegistrationDate(new Date(System.currentTimeMillis()));
        Users savedUser = usersRepository.save(users);
        int userTypeId = users.getUserTypeId().getUserTypeId();
        if(userTypeId == 1){
            recruiterProfileRepository.save(new RecruiterProfile(savedUser));
        }
        else{
            jobSeekerProfileRepository.save(new JobSeekerProfile(savedUser));
        }
        return savedUser;
    }
}
