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

    public void getLevel() {
        switch (level){
            case LOW -> System.out.println("RED");
            case MEDIUM -> System.out.println("YELLOW");
            case HIGH -> System.out.println("GREEN");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}