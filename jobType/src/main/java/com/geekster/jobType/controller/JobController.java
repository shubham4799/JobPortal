package com.geekster.jobType.controller;

import com.geekster.jobType.model.JobModel;
import com.geekster.jobType.service.JobService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/job")
public class JobController {

    @Autowired
     JobService jobService;

    @PostMapping(value = "/addJob")
    public String addJob(@RequestBody List<JobModel> model ){
        return jobService.addJob(model);
    }
    @GetMapping(value = "/getAllJob")
    public List<JobModel> getAllJob(){
        return jobService.getAllJob();
    }

    @GetMapping(value = "/getAllJObByLocation/{location}")
    public List<JobModel> getAllJobByLocation(@PathVariable String location){
        return jobService.getAllJobByLocation(location);
    }
    @PutMapping(value = "/updateLocationById/{id}")
    public String updateLocation(@PathVariable Double id, @RequestBody String location){
        return jobService.updateLocation(id,location);
    }

}
