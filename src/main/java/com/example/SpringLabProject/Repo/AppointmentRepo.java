package com.example.SpringLabProject.Repo;

import com.example.SpringLabProject.Entity.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface AppointmentRepo extends MongoRepository<Appointment,String> {


 Appointment findBypnic(String pnic);





}
