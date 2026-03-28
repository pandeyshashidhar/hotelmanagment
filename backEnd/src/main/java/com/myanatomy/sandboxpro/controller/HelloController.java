package com.myanatomy.sandboxpro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot Backend!";
    }

    @GetMapping("/getAllHotelData")
    public String getAllHotelData() {
        return "This will give you all hotel details";
    }

    @GetMapping("/getAllHotelDetails")
    public String getAllHotelDetails() {
        return "This will give you all hotel details";
    }
}