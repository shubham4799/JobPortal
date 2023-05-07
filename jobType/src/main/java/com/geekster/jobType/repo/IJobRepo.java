package com.geekster.jobType.repo;

import com.geekster.jobType.model.JobModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<JobModel,Integer> {
    @Query(value = "select * from Job_model" , nativeQuery = true)
    List<JobModel> getAllJob();


    @Query(value = "select * from Job_model where Location = :pune " , nativeQuery = true)
    List<JobModel> getAllJobByLocation(String pune);

    @Modifying
    @Query(value = "update Job_model set location = :location where id = :id", nativeQuery = true)
    String updateLocationById(Double id, String location);
}
