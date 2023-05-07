# JOB PORTAL PROJECT

## Fremwork
* Spring Boot
## Language
* Java
## Data Model
 id : Job Id   
 title : Job title   
description : Job description  
location : Job location  
salary : Job Salary  
companyName : Job Company  
employerName : Job Employee Name  
jobType : Job Type
appliedDate : Job Date

## End point

### @PostMapping ("job/addJob")
 Using this end point user can add the job on job portal list.
### @GetMapping ("job/getAllJob")
 Using this end point user can fetch all job in job portal list.
### @GetMapping ("job/getAllJObByLocation/{location}")
 Using this end point user can fetch the job by location.
### @PutMapping ("job/updateLocationById/{id}")
  Using the end point user can update the data as per requirement.
### @DeleteMapping("job/deleteJob/{id})
 Using this end point user can delete the data from job portal list.
 
## Project Summary
 In this project we are performing crud operation on job portal using above endpoint 
 user can perform crud operation also there is used h2 database so we can see the 
 saved data on h2 console,
