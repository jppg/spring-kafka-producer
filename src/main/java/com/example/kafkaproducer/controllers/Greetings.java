package com.example.kafkaproducer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World!";
    }
}
