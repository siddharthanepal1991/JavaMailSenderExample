package com.example.javamailsender.mailsender.controller;

import com.example.javamailsender.mailsender.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailSenderService sendEmailService;

    @GetMapping
    public String email() {
        sendEmailService.sendEmail();
        return "sent";
    }
}
