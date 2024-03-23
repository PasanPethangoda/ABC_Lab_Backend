package com.example.SpringLabProject.Repo;

import com.example.SpringLabProject.Entity.FileDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FileRepository extends MongoRepository<FileDocument,String> {

    List<FileDocument> findByPatientNIC(String patientNIC);
}

