package com.example.service02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private final RestTemplate restTemplate = new RestTemplate();
    @GetMapping
    public ResponseEntity<?> home(){
//        List<String> list = new ArrayList<>();
        String[] template = restTemplate.getForObject("http://student:8081/students", String[].class);
        List<String> emp= Arrays.asList(template);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
}