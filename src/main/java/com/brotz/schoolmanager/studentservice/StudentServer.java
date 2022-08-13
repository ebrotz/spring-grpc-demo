package com.brotz.schoolmanager.studentservice;

import org.springframework.stereotype.Component;

@Component
public class StudentServer {
    private StudentService studentService;
    
    public StudentServer(StudentService studentService) {

    }
}
