package com.kk;

public class Circle {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double getArea(){
        double area = Math.PI*r*r;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*Math.PI*r;
        return perimeter;
    }
}
