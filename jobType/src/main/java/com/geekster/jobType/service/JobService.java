package com.geekster.jobType.service;

import com.geekster.jobType.model.JobModel;
import com.geekster.jobType.repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private IJobRepo iJobRepo;
    public String addJob(Iterable<JobModel> model) {
       Iterable<JobModel> list = iJobRepo.saveAll(model);
       if(list != null){
           return "job added successfully";
       }else{
           return "job could not add";
       }

    }

    public List<JobModel> getAllJob() {
        return iJobRepo.getAllJob();
    }

    public List<JobModel> getAllJobByLocation(String location) {
        return iJobRepo.getAllJobByLocation(location);
    }

    public String updateLocation(Double id, String location) {
        return iJobRepo.updateLocationById(id,location);
    }
}
