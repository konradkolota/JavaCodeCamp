 package com.kk;

import java.time.LocalDate;
import java.util.Random;

public abstract class Robot implements Action {

    protected LocalDate productionDate;
    protected Name name;
    protected final String id;
    protected int howManyTasks;
    protected static int number = 0;

    Random r = new Random();

    public Robot(Name name, int howManyTasks) {
        this.name = name;
        this.howManyTasks = howManyTasks;
        number++;
        String s = "R" + number;
        id = s;
        productionDate = generateDate();
    }

    private LocalDate generateDate(){
        int yr = r.nextInt(2020 - 2000 ) + 2000;
        int month = r.nextInt(12) + 1;
        int day = r.nextInt(28) + 1;

        return LocalDate.of(yr, month, day);
    }

    @Override
    public void work() {
        System.out.println(name + ": działa");
        howManyTasks ++;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "productionDate=" + productionDate +
                ", name=" + name +
                ", id='" + id + '\'' +
                ", howManyTasks=" + howManyTasks +
                '}';
    }
}
