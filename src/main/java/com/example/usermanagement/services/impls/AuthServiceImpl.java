package com.example.usermanagement.services.impls;

import com.example.usermanagement.dtos.login.LoginRequest;
import com.example.usermanagement.dtos.login.LoginResponse;
import com.example.usermanagement.dtos.register.RegisterRequest;
import com.example.usermanagement.dtos.register.RegisterResponse;
import com.example.usermanagement.entities.User;
import com.example.usermanagement.exceptions.InvalidCredentialException;
import com.example.usermanagement.repositories.UserRepository;
import com.example.usermanagement.services.AuthService;

public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        User newUser = new User(request.username(), request.password());
        userRepository.save(newUser);
        return new RegisterResponse();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        User existingUser = userRepository.findByUsername(request.username());
        if(existingUser == null) {
            throw new InvalidCredentialException("Credentials not valid");
        }

        boolean isPasswordCorrect = existingUser.getPassword().equals(request.password());
        if(!isPasswordCorrect) {
            throw new InvalidCredentialException("Credentials not valid");
        }

        return new LoginResponse();
    }
}
