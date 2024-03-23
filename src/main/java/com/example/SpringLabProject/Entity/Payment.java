package com.example.SpringLabProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payment")
public class Payment {

    @Id
    private String _id;
    private String email;
    private String name;
    private String patientNIC;
    private String cardType;
    private String price;
    private String cardNumber;
    private String expireDate;
    private String cvv;


    public Payment(String _id, String email, String name, String patientNIC, String cardType, String price, String cardNumber, String expireDate, String cvv) {
        this._id = _id;
        this.email = email;
        this.name = name;
        this.patientNIC = patientNIC;
        this.cardType = cardType;
        this.price = price;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }


    public Payment() {
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientNIC() {
        return patientNIC;
    }

    public void setPatientNIC(String patientNIC) {
        this.patientNIC = patientNIC;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "_id='" + _id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", patientNIC='" + patientNIC + '\'' +
                ", cardType='" + cardType + '\'' +
                ", price='" + price + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
