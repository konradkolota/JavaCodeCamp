package com.kk.animal;

public class Tiger extends Cat implements Atackable  {
    public Tiger(String name, int length) {
        super(name, length);
    }

    public Tiger(String name) {
        super(name);
    }

    public int attack(){
        return Integer.MAX_VALUE;
    }

    @Override
    public String toString() {
        return "Tiger name: " + getName() + " ap: " + attack();
    }
}
