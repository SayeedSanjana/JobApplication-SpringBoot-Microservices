package com.embarkx.jobapp.job;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class JobController {
    List<Job> jobs = new ArrayList<Job>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }
}
