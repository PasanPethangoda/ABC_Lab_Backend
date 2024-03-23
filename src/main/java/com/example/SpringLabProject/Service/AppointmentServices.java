package com.example.SpringLabProject.Service;

import com.example.SpringLabProject.Entity.Appointment;
import com.example.SpringLabProject.Repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AppointmentServices  {

    @Autowired
    private AppointmentRepo repo;

    public void saveorUpdate(Appointment appointments) {


        repo.save(appointments);
    }

    public Iterable<Appointment> listAll() {

        return this.repo.findAll();
    }

    public void deleteAppointment(String id) {

        repo.deleteById(id);
    }



    public Appointment getAppointmentByNIC(String pnic) {
      return repo.findBypnic(pnic);
   }


}
