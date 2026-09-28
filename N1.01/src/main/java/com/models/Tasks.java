package com.models;

public class Tasks {

    private String task;
    private Levels level;

    public Tasks(String task, Levels level) {
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
