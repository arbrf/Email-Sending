package com.email.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class JavaMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("sk.mohammed5811@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body); // Set the email body
        javaMailSender.send(message); // Send the email
        System.out.println("Mail Sent Successfully!");
        System.out.println("2Mail Sent Successfully!");
        System.out.println("3Mail Sent Successfully!");
    }
}
