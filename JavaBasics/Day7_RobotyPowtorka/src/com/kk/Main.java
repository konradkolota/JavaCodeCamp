package com.kk;

import com.kk.Robots.FactoryRobot;

public class Main {
    public static void main(String[] args) {

        FactoryRobot r1 = new FactoryRobot(Name.ROBERT01, 10, FactoryRobot.Task.LAKIEROWANIE);

        System.out.println(r1);

        r1.work();

    }
}
