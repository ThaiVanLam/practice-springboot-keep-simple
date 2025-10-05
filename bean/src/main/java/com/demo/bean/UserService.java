package com.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private EmailServiceV2 emailService;

    public UserService(EmailServiceV2 emailService) {
    }

    public void registerUser(String email){
        // Logic đăng ký user
        System.out.println("Đăng ký user: " + email);

        // Sử dụng EmailService bean
        emailService.sendEmail(email, "Chào mừng bạn đến với hệ thống!");
    }
}
