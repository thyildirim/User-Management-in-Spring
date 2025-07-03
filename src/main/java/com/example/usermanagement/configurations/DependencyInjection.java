package com.example.usermanagement.configurations;


import com.example.usermanagement.repositories.UserRepository;
import com.example.usermanagement.repositories.impl.UserRepositoryImpl;
import com.example.usermanagement.services.AuthService;
import com.example.usermanagement.services.impls.AuthServiceImpl;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        return mapper;
    }

    @Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
        return new JPAQueryFactory(entityManager);
    }

    @Bean
    public UserRepository userRepository(EntityManager entityManager, JPAQueryFactory jpaQueryFactory){
        return new UserRepositoryImpl(entityManager, jpaQueryFactory);
    }

    @Bean
    public AuthService authService(UserRepository userRepository){
        return new AuthServiceImpl(userRepository);
    }
}
