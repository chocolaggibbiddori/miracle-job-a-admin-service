package com.miracle.adminservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Stack extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String name;

    public Stack(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Stack(String name) {
        this.name = name;
    }
}
