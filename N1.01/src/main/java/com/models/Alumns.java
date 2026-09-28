package com.models;

public class Alumns {

    private String name;
    private int age;
    private String course;
    private double score;
    private Levels level;

    public Alumns(String name, int age, String course, double score, Levels level) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.course = course;
        this.level = level;
    }

    public String getColor() {
        return switch (level) {
            case LOW -> "Red";
            case MEDIUM -> "Yellow";
            case HIGH -> "Green";
        };
    }

}