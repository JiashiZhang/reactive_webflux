package com.example.reactive_webflux.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@Table("users") // 数据库表名
public class Person {

    // Getters and Setters
    @Id
    private String id;
    private String name;
    private int age;

    public Person() {}

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
