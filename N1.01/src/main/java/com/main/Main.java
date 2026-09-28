package com.main;

import com.models.Alumns;
import com.models.Days;
import com.models.Levels;
import com.models.Tasks;

public class Main {
    static void main(String[] args) {

        Tasks task = new Tasks("Buy milk", Levels.MEDIUM);
        System.out.println(task.getTask() + " is " + task.getLevel());

        Alumns alumn = new Alumns("Fabio", 23,"JAVA", 10.0, Levels.HIGH);


    }

}
