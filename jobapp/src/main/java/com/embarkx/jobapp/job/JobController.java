package com.embarkx.jobapp.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAll(){
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping("/create-jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job){
        jobService.createJob(job);
        return new ResponseEntity<>("Job created successfully", HttpStatus.CREATED  );
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        if(jobService.getJobById(id) != null){
            return new ResponseEntity<>(jobService.getJobById(id), HttpStatus.OK);
        };
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id){
        boolean deleted = jobService.deleteJob(id);
        if(deleted){
            return new ResponseEntity<>("Successfully deleted the job",HttpStatus.OK);
        }
        return new ResponseEntity<>("Job not found", HttpStatus.NOT_FOUND);
    }
}
