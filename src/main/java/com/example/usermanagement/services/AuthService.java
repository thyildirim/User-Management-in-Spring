package com.example.usermanagement.services;

import com.example.usermanagement.dtos.login.LoginRequest;
import com.example.usermanagement.dtos.login.LoginResponse;
import com.example.usermanagement.dtos.register.RegisterRequest;
import com.example.usermanagement.dtos.register.RegisterResponse;

public interface AuthService {

    RegisterResponse register (RegisterRequest request);
    LoginResponse login (LoginRequest request);

}
