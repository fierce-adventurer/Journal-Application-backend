package com.fierce.adventurer.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@SpringBootTest
public class EmailServiceTests {

    @Autowired EmailService emailService;

    @Test
    void testSendMail(){
        emailService.sendEmail("cesila1969@iridales.com","testing java mail sender" , "this is a test email , dont need a reply");
    }
}
