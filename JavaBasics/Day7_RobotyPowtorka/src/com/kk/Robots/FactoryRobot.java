package com.kk.Robots;

import com.kk.Name;
import com.kk.Robot;

public class FactoryRobot extends Robot {

    public enum Task{
        SKRAWANIE,
        ZGRZEWANIE,
        MODELOWANIE,
        PODNOSNIK,
        LAKIEROWANIE,
        SKLEJANIE
    }

    public Task task;

    public FactoryRobot(Name name, int howManyTasks, Task task) {
        super(name, howManyTasks);
        this.task = task;
    }

    @Override
    public String toString() {
        return "FactoryRobot{" +
                "task=" + task +
                ", productionDate=" + productionDate +
                ", name=" + name +
                ", id='" + id + '\'' +
                ", howManyTasks=" + howManyTasks +
                '}';
    }

    @Override
    public void work() {
        super.work();

    }
}
