package com.java.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.java.controller", "com.java.service"})
public class SpringBootStudentMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudentMain.class, args);
        System.out.println("Server started successfully");
    }
}
