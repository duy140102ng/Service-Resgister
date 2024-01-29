package com.example.service03.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "http://localhost:8081/students", name = "student")
public interface StudentService {
    @GetMapping
    List<String> getStudent();
}
