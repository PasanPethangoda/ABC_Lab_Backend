package com.example.SpringLabProject.Repo;

import com.example.SpringLabProject.Entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PaymentRepository extends MongoRepository<Payment,String> {
    List<Payment> findByPatientNIC(String patientNIC);

}
