package com.kk;

public class Pokoj {
    private double width, length,height;

    public Pokoj(double width, double length, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Pokoj(){
        this.length = 5;
        this.width = 2.5;
        this.height = 2.75;
    }

    public Pokoj(double wymiar){
        this.length = wymiar;
        this.width = wymiar;
        this.height = wymiar;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }

    public double getVelocity(){
        return width*length*height;
    }

    public double getSufit(){
        return length*width;
    }

    public double getArea(){
        return getSufit();
    }

    public double getWallsArea(){
        return 2*length*height + 2*width*height;
    }
}
