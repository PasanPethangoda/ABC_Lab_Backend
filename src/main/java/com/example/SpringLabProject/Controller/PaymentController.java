package com.example.SpringLabProject.Controller;

import com.example.SpringLabProject.Entity.Payment;
import com.example.SpringLabProject.Repo.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/payment")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/submitForm")
    public String submitForm(@RequestBody Payment payment){
        paymentRepository.save(payment);

        try {
            sendConfirmationEmail(payment);
            return "Form submitted successfully!";
        }catch (Exception e){
            return "Error submitting the form. Please try again.";
        }
    }

    @GetMapping("/getAllPayment")
    public List<Payment> getAllPayment(){
        return paymentRepository.findAll();
    }

    @GetMapping("/search/{patientNIC}")
    public List<Payment> getByPatientNIC(@PathVariable String patientNIC){
        return paymentRepository.findByPatientNIC(patientNIC);
    }

    private void sendConfirmationEmail(Payment payment){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(payment.getEmail());
        message.setSubject("ABC-Laboratory Payment Receipt");
        message.setText("Hi " + payment.getName() + "\n\n" + "Your Payment Has Been Successfully - Thank You ! \n\n" +
                "Name: " + payment.getName() + "\n" +
                "Patient NIC:  " + payment.getPatientNIC() + "\n" +
                "Card Type: " + payment.getCardType() + "\n" +
                "Price: " + payment.getPrice() + "\n" +
                "Card Number: " + payment.getCardNumber() + "\n" +
                "Expire Date: " + payment.getExpireDate() + "\n" +
                "CVV: " + payment.getCvv() + "\n\n" +
                "Best Regards, \n" +
                "ABC - Laboratory Team.....!");

        javaMailSender.send(message);
    }



}
