package com.kk;

public class Rectangle {
    private double a,b,c;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getArea(){
        double area = a*b;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*a+2*b;
        return perimeter;
    }
}
