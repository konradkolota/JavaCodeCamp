package com.kk;

public class Triangle {
    private double a,b,c,h;

    public Triangle(double a, double b, double c, double h){
        this.a =a;
        this.b =b;
        this.c =c;
        this.h =h;
    }

    public double getArea(){
        double area = 0.5*a*h;
        return area;
    }

    public double getPerimeter(){
        double perimeter = a+b+c;
        return perimeter;
    }
}
