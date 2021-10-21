package com.example.javamailsender.mailsender.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;

@Repository
public class EmailSenderRepoImpl implements EmailSenderRepository{

    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void sendEmail() {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            //message.setFrom("styleandcutsaloon@gmail.com");
            message.setTo("styleandcutsaloon@gmail.com");
            message.setSubject("subject");
            message.setText("body");
            javaMailSender.send(message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
