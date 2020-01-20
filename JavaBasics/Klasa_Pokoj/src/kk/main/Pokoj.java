package kk.main;

public class Pokoj {
    //pola
    private double height;
    private double width;
    private double length;
    private String color;

    //konstruktory
    public Pokoj(double height, double width, double length, String color) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    //metody
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        double area = width * length;
        return area;
    }

    public double volume() {
        double volume = width * length * height;
        return volume;
    }

    public void mesurementInfo() {
        System.out.println();
    }

    public void info() {
        System.out.println("Pokój ma wymiary: " + getHeight() + "m wysokości, " + getWidth() + "m szerokości oraz " + getLength() + "m długości.");
        System.out.println("Ma powierzchnię równą: " + area() + "m2");
        System.out.println("Ma objętość równą: " + volume() + "m3");
        System.out.println("Jest w kolorze: " + getColor());
    }

    public String toString() {
        return
                "Pokój ma wymiary: " + getHeight() + "m wysokości, " + getWidth() + "m szerokości oraz " + getLength() + "m długości." + " Ma powierzchnię równą: " + area() + "m2" + " Ma objętość równą: " + volume() + "m3" + " Jest w kolorze: " + getColor();
    }
}
