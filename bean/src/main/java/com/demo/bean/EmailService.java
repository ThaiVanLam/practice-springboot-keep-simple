package com.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void sendEmail(String to, String message) {
        System.out.println("Gửi email đến: " + to);
        System.out.println("Nội dung: " + message);
    }
}
