package com.kk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FactoryRobot robot1 = new FactoryRobot(5, FactoryRobot.Task.LAKIEROWANIE);
        FactoryRobot robot2 = new FactoryRobot(2, FactoryRobot.Task.MODELOWANIE);
        FactoryRobot robot3 = new FactoryRobot(21, FactoryRobot.Task.SKRAWANIE);

        FoldingRobot robot4 = new FoldingRobot(1, 12);
        FoldingRobot robot5 = new FoldingRobot(2,10);
        FoldingRobot robot6 = new FoldingRobot(3, 24);

        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
        System.out.println(robot4);
        System.out.println(robot5);
        System.out.println(robot6);

        try {
            robot4.work();
        } catch (EndOfLimitException e) {
            e.getMessage();
        }

        Hoover r1 = new Hoover(0, 3);
        HouseRobot r2 = new HouseRobot(23, r1);


    }
}
