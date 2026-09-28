package com.main;

import com.models.Days;
import com.models.Levels;
import com.models.Tasks;

public class Main {
    static void main(String[] args) {

        Days.checkDays(Days.SUNDAY);

        Tasks task = new Tasks("Buy milk", Levels.MEDIUM);
        System.out.println(task.getTask() + " is " + task.getLevel());

    }

}
