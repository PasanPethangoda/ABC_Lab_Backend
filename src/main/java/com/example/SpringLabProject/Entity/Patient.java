package com.example.SpringLabProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patients")
public class Patient {

    @Id
    private String _id;
    private String patientname;
    private String patientnic;
    private String patientmail;
    private String patientdoctor;
    private String mobile;


    public Patient(String _id, String patientname, String patientnic, String patientmail, String patientdoctor, String mobile) {
        this._id = _id;
        this.patientname = patientname;
        this.patientnic = patientnic;
        this.patientmail = patientmail;
        this.patientdoctor = patientdoctor;
        this.mobile = mobile;
    }


    public Patient() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientnic() {
        return patientnic;
    }

    public void setPatientnic(String patientnic) {
        this.patientnic = patientnic;
    }

    public String getPatientmail() {
        return patientmail;
    }

    public void setPatientmail(String patientmail) {
        this.patientmail = patientmail;
    }

    public String getPatientdoctor() {
        return patientdoctor;
    }

    public void setPatientdoctor(String patientdoctor) {
        this.patientdoctor = patientdoctor;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "_id='" + _id + '\'' +
                ", patientname='" + patientname + '\'' +
                ", patientnic='" + patientnic + '\'' +
                ", patientmail='" + patientmail + '\'' +
                ", patientdoctor='" + patientdoctor + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
