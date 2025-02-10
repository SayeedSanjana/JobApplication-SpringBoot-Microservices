package com.embarkx.jobapp.company;

import com.embarkx.jobapp.job.Job;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Company {

    @Id
    private Long Id;
    private String name;
    private String description;

    @OneToMany
    private List<Job> jobs;


    public Company() {

    }

    public void setId(Long id) {
        this.Id = id;
    }

    public Long getId() {
        return Id;
    }
}
