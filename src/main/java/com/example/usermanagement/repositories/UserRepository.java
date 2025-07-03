package com.example.usermanagement.repositories;

import com.example.usermanagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
    User findByUsername(String username);
}
