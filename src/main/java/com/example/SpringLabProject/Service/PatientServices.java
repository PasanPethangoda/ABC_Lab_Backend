package com.example.SpringLabProject.Service;


import com.example.SpringLabProject.Entity.Patient;
import com.example.SpringLabProject.Repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServices   {

    @Autowired
    private PatientRepo repo;

    public void saveorUpdate(Patient patients) {

        repo.save(patients);
    }
    public Iterable<Patient> listAll() {

        return this.repo.findAll();
    }
    public void deletePatient(String id) {

        repo.deleteById(id);
    }
    public Patient getPatientByID(String patientid) {
        return repo.findById(patientid).get();
    }
}
