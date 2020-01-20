package com.kk.animal;

public class Lion extends Cat implements Atackable {
    public Lion(String name, int length) {
        super(name, length);
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return new Tiger("x").attack() -1;
    }

    @Override
    public String toString() {
        return "Lion name: " + getName() + " ap: " + attack();
    }
}
