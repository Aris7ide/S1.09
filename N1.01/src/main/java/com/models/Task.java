package com.models;

public class Task {

    private String task;
    private Levels level;

    public Task(String task, Levels level) {
        this.task = task;
        this.level = level;
    }

    public String getTask() {
        return task;
    }

    public Levels getLevel() {
        return level;
    }
}
