/*
package com.example.querydslpractice.repository;

import com.example.querydslpractice.model.QUser;
import com.example.querydslpractice.model.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findUsersByName(String name) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QUser qUser = QUser.user;
        return queryFactory.selectFrom(qUser)
                .where(qUser.name.eq(name))
                .fetch();
    }
}
*/
