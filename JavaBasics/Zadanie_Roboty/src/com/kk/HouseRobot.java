package com.kk;

public class HouseRobot extends Robot implements ActionPlus {
    private Hoover cleaningTool;

    public HouseRobot(int howManyTasks, Hoover cleaningTool) {
        super(howManyTasks);
        this.cleaningTool = cleaningTool;
    }

    public Hoover getCleaningTool() {
        return cleaningTool;
    }

    public void setCleaningTool(Hoover cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    @Override
    public void work() throws EndOfLimitException {
        System.out.println(getName() + ": working");
        howManyTasks++;
    }

    @Override
    public void workWithPlus() {
        System.out.println(getId() + ": house robot with plus actions!");
        howManyTasks++;
    }

    @Override
    public String toString() {
        return "HouseRobot{" +
                "cleaningTool=" + cleaningTool +
                ", productionDate=" + productionDate +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", howManyTasks=" + howManyTasks +
                '}';
    }


}
