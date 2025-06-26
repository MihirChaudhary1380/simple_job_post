package com.telusko.JobApp.service;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private jobRepo repo;


    // method to add a jobPost
    public void addjob(JobPost jobPost) {
        repo.addJob(jobPost);

    }

    public List<JobPost> getAlljobs(){
    return repo.getAllJobs();
    }
}
