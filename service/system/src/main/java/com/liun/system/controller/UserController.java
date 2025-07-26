package com.liun.system.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Value("${a}")
    private String a;

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/a")
    public String a() {
        return a;
    }
}
