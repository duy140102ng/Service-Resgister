package com.example.service03.controller;

import com.example.service03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public ResponseEntity<?> home(){
        List<String> list = studentService.getStudent();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
