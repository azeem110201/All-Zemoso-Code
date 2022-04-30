package com.azeem.restapi.rest;

import com.azeem.restapi.pojoentity.Student;
import com.github.javafaker.Faker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoStudentController {

    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        Faker faker = new Faker();

        for(int i = 0; i < 5; i++){
            students.add(new Student(faker.name().firstName(), faker.name().lastName()));
        }
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if(studentId > students.size() || studentId < 0){
            throw new StudentNotFoundException("Student ID (" + studentId + ") Not Found");
        }

        return students.get(studentId);
    }

    // Add a exception handler to the students
    @ExceptionHandler
    // Response Type is StudentErrorResponse                           In parameters, possible error that can take place are passed
    public ResponseEntity<StudentErrorResponse> handleStudentException(StudentNotFoundException exec){
        StudentErrorResponse error = new StudentErrorResponse();

        error.setMessage(exec.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Add Catch All Exception to student

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleAllOtherExceptionStudent(Exception exec){
        StudentErrorResponse error = new StudentErrorResponse();

        error.setMessage(exec.getMessage());
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
