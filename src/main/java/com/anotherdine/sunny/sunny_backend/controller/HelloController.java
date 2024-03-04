package com.anotherdine.sunny.sunny_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/test")
    public String test() {
        return "연결 완료";
    }
}
