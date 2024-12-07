package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ExampleEntity {
    @Id
    private Long id;
    private String name;

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
