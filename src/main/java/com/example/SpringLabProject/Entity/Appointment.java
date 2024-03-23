package com.example.SpringLabProject.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "appointments")
public class Appointment {


    @Id
    private String _id;
    private String pnic;
    private String pname;
    private String date;
    private String time;
    private String tokenNo;


    public Appointment(String _id, String pnic, String pname, String date, String time, String tokenNo) {
        this._id = _id;
        this.pnic = pnic;
        this.pname = pname;
        this.date = date;
        this.time = time;
        this.tokenNo = tokenNo;
    }

    public Appointment() {
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPnic() {
        return pnic;
    }

    public void setPnic(String pnic) {
        this.pnic = pnic;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(String tokenNo) {
        this.tokenNo = tokenNo;
    }


    @Override
    public String toString() {
        return "Appointment{" +
                "_id='" + _id + '\'' +
                ", pnic='" + pnic + '\'' +
                ", pname='" + pname + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", tokenNo='" + tokenNo + '\'' +
                '}';
    }
}
