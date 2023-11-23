package com.example.querydslpractice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "username", "age"})
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;

    private int age;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "team_id")
//    private Team team;


    public static Member createTestMember() {
        return new Member();
    }

    public Member(Long id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
//        if(team != null) {
//            changeTeam(team);
//        }
    }
}
