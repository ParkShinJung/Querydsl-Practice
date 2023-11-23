package com.example.querydslpractice.service;

import com.example.querydslpractice.model.Member;
import com.example.querydslpractice.model.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final JPAQueryFactory queryFactory;

    public UserService(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public Member findMemberByUsername(String username) {
        QMember m = QMember.member;
        return queryFactory.selectFrom(m)
                .where(m.username.eq(username))
                .fetchOne();
    }
}

