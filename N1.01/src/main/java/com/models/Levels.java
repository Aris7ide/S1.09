package com.models;

public enum Levels {
    LOW,MEDIUM,HIGH;

    public void toString (Levels level) {
        switch (level) {
            case LOW -> System.out.println("LOW");
            case MEDIUM -> System.out.println("MEDIUM");
            case HIGH -> System.out.println("HIGH");
        }
    }
}
