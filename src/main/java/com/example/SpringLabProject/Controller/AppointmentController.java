package com.example.SpringLabProject.Controller;

import com.example.SpringLabProject.Entity.Appointment;
import com.example.SpringLabProject.Service.AppointmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentServices appointmentServices;


    @PostMapping(value= "/save" )
    private String saveAppointment(@RequestBody Appointment appointments)
     {

         appointmentServices.saveorUpdate(appointments);
         return appointments.get_id();
     }

    @GetMapping(value= "/getall" )
    private Iterable<Appointment>getAppointments()
    {
        return appointmentServices.listAll();
    }


    @PutMapping(value= "/edit/{id}" )
    private Appointment update(@RequestBody Appointment appointment,@PathVariable(name = "id")String _id)
    {
        appointment.set_id(_id);
        appointmentServices.saveorUpdate(appointment);
        return appointment;
    }


    @DeleteMapping("/delete/{id}" )
    private void deleteAppointment(@PathVariable("id") String _id)
    {
        appointmentServices.deleteAppointment(_id);
    }


    @RequestMapping("/search/{pnic}")
    private Appointment getAppointmentByNIC(@PathVariable(name = "pnic")String pnic)
    {
        return appointmentServices.getAppointmentByNIC(pnic);
    }





}
