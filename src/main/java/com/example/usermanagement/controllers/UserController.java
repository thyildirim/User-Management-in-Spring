package com.example.usermanagement.controllers;

import com.example.usermanagement.dtos.login.LoginRequest;
import com.example.usermanagement.dtos.login.LoginResponse;
import com.example.usermanagement.dtos.register.RegisterRequest;
import com.example.usermanagement.dtos.register.RegisterResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/register")
    public RegisterResponse register (@RequestBody RegisterRequest request){
        return new RegisterResponse();
    }


    @PostMapping("/login")
    public LoginResponse login (@RequestBody LoginRequest request){
        return new LoginResponse();
    }












}
