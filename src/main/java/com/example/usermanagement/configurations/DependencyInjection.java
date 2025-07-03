package com.example.usermanagement.configurations;


import com.example.usermanagement.services.UserService;
import com.example.usermanagement.services.impls.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}
