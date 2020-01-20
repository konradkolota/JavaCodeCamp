package com.kk;

import java.util.Random;

public final class FoldingRobot extends FactoryRobot implements Action{

    protected int limit;

    public FoldingRobot(int howManyTasks, int limit) {
        super(howManyTasks);
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "FoldingRobot{" +
                "limit=" + limit +
                ", productionDate=" + productionDate +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", howManyTasks=" + howManyTasks +
                '}';
    }

    public void work() throws EndOfLimitException {
        if(limit < 0){
            super.work();
            limit--;
        } else{
            System.out.println(getId() + " can not work");
            throw new EndOfLimitException("broken");
        }
    }

    private int setLimit(){
        Random r = new Random();
        return r.nextInt(10) + 1;
    }

    private void repairRobot(){
        if(limit == 0){
            setLimit();
            System.out.println("Repairing robot completed!");
        } else System.out.println("Robot works fine.");
    }
}
