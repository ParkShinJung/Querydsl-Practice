package com.example.querydslpractice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Champion {

    @Id @GeneratedValue
    @Column(name = "champion_id")
    private Long id;

    private String name;

    public Champion(String name) {
        this.name = name;
    }

    public Champion() {

    }
}
