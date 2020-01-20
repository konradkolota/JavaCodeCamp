package com.kk;

public class Human {

    private int age;
    private int weight;
    private int height;
    private String Name;
    private boolean isMale;

    public Human(int age, int weight, int height, String name, boolean isMale) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        Name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return Name;
    }

    public boolean isMale() {
        return isMale;
    }
}
