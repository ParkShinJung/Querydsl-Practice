package com.example.querydslpractice;

import com.example.querydslpractice.model.Member;

import com.example.querydslpractice.service.UserService;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;


@SpringBootTest
class UserServiceTest {

    @MockBean
    private UserService userService;


    @BeforeEach
    void setUp() {
        Member sjparkMember = new Member(1L,"sjpark", 17);
        Member shinMember = new Member(2L, "shin", 21);
        Member jungMember = new Member(3L, "jung", 33);

        when(userService.findMemberByUsername("sjpark")).thenReturn(sjparkMember);
        when(userService.findMemberByUsername("shin")).thenReturn(shinMember);
        when(userService.findMemberByUsername("jung")).thenReturn(jungMember);
    }


    @Test
    void startQuerydsl() {

        // 테스트 수행
        Member findMember = userService.findMemberByUsername("sjpark");
        // 결과 검증
        assertThat(findMember.getUsername()).isEqualTo("sjpark");
        // 결과 출력
        System.out.println("검증된 멤버의 이름: " + findMember);
    }

}