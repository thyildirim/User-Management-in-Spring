package com.example.usermanagement.repositories;

import com.example.usermanagement.entities.User;

public interface UserRepository {
    User save(User user);
    User findByUsername(String username);
}
