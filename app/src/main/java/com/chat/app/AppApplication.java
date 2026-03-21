package com.chat.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
        System.out.println(" Chat Application started successfully!");
        System.out.println(" Open browser and go to: http://localhost:8080");
    }
}