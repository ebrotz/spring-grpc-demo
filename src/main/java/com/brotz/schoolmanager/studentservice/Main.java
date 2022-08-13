package com.brotz.schoolmanager.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@SpringBootApplication
public class Main {
    @Autowired 
    private StudentService studentService;

    @Bean
    public Server serverBuilder() {
        return ServerBuilder
            .forPort(50051)
            .addService(studentService)
            .build();
    }

    public static void main(String args[]) {
        SpringApplication.run(Main.class, args);
    }
}
