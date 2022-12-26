package com.example.controllers;

import com.example.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping("/")
    public String users() {
        return userService.findAll().toString();
    }
}
