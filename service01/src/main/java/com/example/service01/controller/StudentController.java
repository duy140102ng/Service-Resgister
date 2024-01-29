package com.example.service01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public ResponseEntity<?> student(){
        List<String> list = new ArrayList<>();
        list.add("Hồ Ngọc Hà");
        list.add("LinhMiu");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
