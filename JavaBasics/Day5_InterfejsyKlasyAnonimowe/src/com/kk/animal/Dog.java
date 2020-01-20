package com.kk.animal;

public class Dog extends Animal implements Atackable {
    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public int attack() {
        return 100;
    }

    @Override
    public String toString() {
        return "Dog, name: "
 + name + ", it heights: " + weight + "ap: " + attack();}
}
