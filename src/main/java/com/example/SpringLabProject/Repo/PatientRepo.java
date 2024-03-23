package com.example.SpringLabProject.Repo;

import com.example.SpringLabProject.Entity.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepo extends MongoRepository<Patient,String> {


}

