package com.models;

public enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;


    public static void checkDays(Days day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + " is weekend");
                break;
            default:
                System.out.println(day + " is weekday");
        }
    }
}
