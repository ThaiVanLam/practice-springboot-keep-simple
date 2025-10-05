package com.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class EmailServiceV2 {
    public void sendEmail(String to, String message) {
        System.out.println("Gửi email đến: " + to+ " từ EmailServiceV2");
        System.out.println("Nội dung: " + message + "từ EmailServiceV2");
    }
}
