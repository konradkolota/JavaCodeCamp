package com.kk;

public class Hoover extends Robot {
    protected int howManyBrushes;

    public Hoover(int howManyTasks, int howManyBrushes) {
        super(howManyTasks);
        this.howManyBrushes = howManyBrushes;
    }

    public int getHowManyBrushes() {
        return howManyBrushes;
    }

    public void setHowManyBrushes(int howManyBrushes) {
        this.howManyBrushes = howManyBrushes;
    }

    public void work() throws EndOfLimitException{
        System.out.println(getId() + ": working");
        howManyTasks++;
    }

}
