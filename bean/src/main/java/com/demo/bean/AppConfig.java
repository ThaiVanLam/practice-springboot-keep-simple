package com.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmailServiceV2 emailService() {
        return new EmailServiceV2();
    }

    @Bean
    public UserService userService() {
        return new UserService(emailService());
    }
}
