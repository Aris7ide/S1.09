package com.models;

public enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;


    public static String checkDays(Days day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                return day + " is weekend";
            default:
                return day + " is weekday";
        }
    }
}
