package com.example.javamailsender.mailsender.service;

import com.example.javamailsender.mailsender.repository.EmailSenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImpl implements EmailSenderService{
    @Autowired
    private EmailSenderRepository emailSenderRepository;

    @Override
    public void sendEmail() {
        emailSenderRepository.sendEmail();
    }
}
