package com.example.SpringLabProject.Controller;

import com.example.SpringLabProject.Entity.Patient;
import com.example.SpringLabProject.Service.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/patient")
public class PatientController {

    @Autowired
    private PatientServices patientServices;

    @PostMapping(value= "/save")
    private String savePatient(@RequestBody Patient patients)
    {

        patientServices.saveorUpdate(patients);
        return patients.get_id();
    }


    @GetMapping(value= "/getall" )
    private Iterable<Patient>getPatients()
    {

        return patientServices.listAll();
    }

    @PutMapping(value= "/edit/{id}" )
    private Patient update(@RequestBody Patient patient,@PathVariable(name = "id")String _id)
    {

        patient.set_id(_id);
        patientServices.saveorUpdate(patient);
        return patient;

    }

    @DeleteMapping("/delete/{id}")
    private void deletePatient(@PathVariable("id") String _id)
    {

        patientServices.deletePatient(_id);
    }


    @RequestMapping("/search/{id}")
    private Patient getPatients(@PathVariable(name="id")String patientid)
    {
        return patientServices.getPatientByID(patientid);
    }



}
