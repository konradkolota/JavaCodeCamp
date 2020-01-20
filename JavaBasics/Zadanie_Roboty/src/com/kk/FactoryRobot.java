package com.kk;

public class FactoryRobot extends Robot{

    public enum Task{
        SKRAWANIE,
        ZGRZEWANIE,
        MODELOWANIE,
        PODNOSNIK,
        LAKIEROWANIE,
        SKLEJANIE;
    }

    private Task task;


    public FactoryRobot(int howManyTasks) {
        super(howManyTasks);
    }

    public FactoryRobot(int howManyTasks, Task task) {
        super(howManyTasks);
        this.task = task;
    }

    @Override
    public void work() throws EndOfLimitException {
        System.out.println(getName() + ": working");
        howManyTasks++;
    }

    @Override
    public String toString() {
        return "FactoryRobot{" +
                "task=" + task +
                ", productionDate=" + productionDate +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", howManyTasks=" + howManyTasks +
                '}';
    }
}
