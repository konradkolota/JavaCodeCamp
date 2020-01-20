package com.kk;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Robot implements Action {

    protected LocalDate productionDate = generateProductionDate();
    protected String name = chooseName();
    protected final String id = idGenerator();
    protected int howManyTasks = 0;
    protected static int counter = 0;

    public Robot(int howManyTasks)
    {
        this.howManyTasks = howManyTasks;
        counter++;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getHowManyTasks() {
        return howManyTasks;
    }

    private LocalDate generateProductionDate(){
        long zeroDate = LocalDate.of(2000, 1,1).toEpochDay();
        long maxDay = LocalDate.now().toEpochDay();
        long randomDate = ThreadLocalRandom.current().nextLong(zeroDate, maxDay);
        LocalDate randDay = LocalDate.ofEpochDay(randomDate);
        return randDay;
    }

    private String chooseName(){
        Random r = new Random();
        String names[] = {"Adam1000", "Roman2", "Aleks900", "Zosia Samosia", "Ala2", "Robert01", "Ula2"};
        int index =  r.nextInt(names.length);
        return names[index];
    }

    //można też za pomocą printf========================

    private String idGenerator(){
        String  pattern = "000";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String out = myFormat.format(counter);
        return "R" + out;
    }

}
