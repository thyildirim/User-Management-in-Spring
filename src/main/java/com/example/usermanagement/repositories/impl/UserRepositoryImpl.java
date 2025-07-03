package com.example.usermanagement.repositories.impl;

import com.example.usermanagement.entities.QUser;
import com.example.usermanagement.entities.User;
import com.example.usermanagement.repositories.UserRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional
public class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;
    private final JPAQueryFactory jpaQueryFactory;

    private static final QUser qUser = QUser.user;

    public UserRepositoryImpl(EntityManager entityManager, JPAQueryFactory jpaQueryFactory) {
        this.entityManager = entityManager;
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public User save(User user) {
        entityManager.persist(user);
        return user;
    }

    @Override
    public User findByUsername(String username) {
        List<User> result = jpaQueryFactory
                .select(qUser)
                .from(qUser)
                .where(qUser.username.eq(username))
                .fetch();
        if (result.size() != 1) {
            throw new RuntimeException("user not found");
        }
        return result.getFirst();
    }
}
