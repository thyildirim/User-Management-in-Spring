package com.example.usermanagement.services.impls;

import com.example.usermanagement.dtos.login.LoginRequest;
import com.example.usermanagement.dtos.login.LoginResponse;
import com.example.usermanagement.dtos.register.RegisterRequest;
import com.example.usermanagement.dtos.register.RegisterResponse;
import com.example.usermanagement.services.UserService;

public class UserServiceImpl implements UserService {


    @Override
    public RegisterResponse register(RegisterRequest request) {
        return new RegisterResponse();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return new LoginResponse();
    }
}
