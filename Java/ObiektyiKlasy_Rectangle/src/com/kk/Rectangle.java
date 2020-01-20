package com.kk;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private double getArea(){
        return getA()*getB();
    }

    private double getParimeter(){
        return getA() + getB();
    }

    private double getDiagonal(){
        double c = (getA()*getA()) + (getB()*getB());
        return Math.sqrt(c);
    }

    @Override
    public String toString() {
        return "Prostokąt o wymiarach: a: " + getA() + " oraz b: " + getB() + ". Ma pole powierzchni: " + getArea()
                + ". Jego obwód wynosi: " + getParimeter() + ". Jego przekątkna ma długość: " + getDiagonal() + ".";
    }
}
