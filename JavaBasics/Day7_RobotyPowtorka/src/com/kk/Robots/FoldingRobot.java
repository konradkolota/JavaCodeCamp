package com.kk.Robots;

import com.kk.Name;
import com.kk.Robot;

public class FoldingRobot extends Robot {

    private int limit;

    public FoldingRobot(Name name, int howManyTasks, int limit) {
        super(name, howManyTasks);
        this.limit = limit;
    }
}
