package com.makers.makersbnb_coach_support_code.model;

public class Planet {
    private String description;
    private Integer circumference;

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
