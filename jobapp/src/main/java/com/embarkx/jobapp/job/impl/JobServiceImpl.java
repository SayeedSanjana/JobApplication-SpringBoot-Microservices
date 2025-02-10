package com.embarkx.jobapp.job.impl;

import com.embarkx.jobapp.job.Job;
import com.embarkx.jobapp.job.JobRepository;
import com.embarkx.jobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {
    //List<Job> jobs = new ArrayList<Job>();
    JobRepository jobRepository;
//    private Long nextId=1L;

    JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
//        job.setId(nextId++);
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
//        for(Job job : jobs) {
//            if(job.getId().equals(id)){
//                return job;
//            }
//
    }

    @Override
    public boolean deleteJob(Long id) {
        try {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
//        Iterator<Job> iterator = jobs.iterator();
//        while(iterator.hasNext()){
//            Job job = iterator.next();
//            if(job.getId().equals(id)){
//                iterator.remove();
//                return true;
//            }
//        }
//        return false;
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> joboptional = jobRepository.findById(id);

       if(joboptional.isPresent()) {
           Job job = joboptional.get();
           job.setTitle(updatedJob.getTitle());
           job.setDescription(updatedJob.getDescription());
           job.setMaxSalary(updatedJob.getMaxSalary());
           job.setMinSalary(updatedJob.getMinSalary());
           job.setLocation(updatedJob.getLocation());
           jobRepository.save(job);
           return true;
       }
        return false;
    }
}
