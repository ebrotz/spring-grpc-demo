package com.brotz.schoolmanager.studentservice;

import org.springframework.stereotype.Component;

import com.brotz.schoolmanager.studentservice.StudentServiceGrpc.StudentServiceImplBase;
import com.brotz.schoolmanager.studentservice.StudentServiceOuterClass.Student;
import com.brotz.schoolmanager.studentservice.StudentServiceOuterClass.StudentId;

import io.grpc.stub.StreamObserver;

@Component
public class StudentService extends StudentServiceImplBase {
    @Override
    public void getStudent(StudentId request, StreamObserver<Student> responseObserver) {
        // TODO Get the student object.
        responseObserver.onCompleted();
    }
}
