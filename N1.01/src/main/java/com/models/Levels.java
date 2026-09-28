package com.models;

public enum Levels {
    LOW,MEDIUM,HIGH;

    public String toString (Levels level) {
        return switch (level) {
            case LOW -> "LOW";
            case MEDIUM -> "MEDIUM";
            case HIGH -> "HIGH";
        };
    }
}
