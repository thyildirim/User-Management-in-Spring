package com.example.usermanagement.repositories;

import com.example.usermanagement.entities.User;

public interface UserRepository {
    User createUser(User user);
    User findByUsername(String username);
}
