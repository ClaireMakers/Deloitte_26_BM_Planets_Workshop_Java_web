package com.makers.makersbnb_coach_support_code.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name = "PLANETS")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer circumference;
    private String name;

    public Planet() {

    }

    public Planet(String description, Integer circumference) {
        this.description = description;
        this.circumference = circumference;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getCircumference() {
        return this.circumference;
    }
}
