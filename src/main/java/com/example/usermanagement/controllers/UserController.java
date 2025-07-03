package com.example.usermanagement.controllers;

import com.example.usermanagement.dtos.login.LoginRequest;
import com.example.usermanagement.dtos.login.LoginResponse;
import com.example.usermanagement.dtos.register.RegisterRequest;
import com.example.usermanagement.dtos.register.RegisterResponse;

import com.example.usermanagement.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public RegisterResponse register (@RequestBody RegisterRequest request){
        return userService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login (@RequestBody LoginRequest request){
        return userService.login(request);
    }

}
