package com.example.usermanagement.configurations;


import com.example.usermanagement.services.AuthService;
import com.example.usermanagement.services.impls.AuthServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {

    @Bean
    public AuthService userService(){
        return new AuthServiceImpl();
    }
}
