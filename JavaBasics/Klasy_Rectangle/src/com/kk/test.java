package com.kk;

public class test {
    public static void main(String[] args) {

        Rectangle policz = new Rectangle(3,4);
        System.out.println("Pole: " + policz.getArea());
        System.out.println("Obwód: " + policz.getPerimeter());

        System.out.println("===============================");

        Circle policzKolo = new Circle(3);
        System.out.println("Pole: " + policzKolo.getArea());
        System.out.println("Obwód: " + policzKolo.getPerimeter());

        System.out.println("===============================");

        Triangle policzTrojkat = new Triangle(2,3,4,5);
        System.out.println("Pole: " + policzTrojkat.getArea());
        System.out.println("Obwód: " + policzTrojkat.getPerimeter());
    }
}
