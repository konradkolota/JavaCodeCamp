package com.kk;

public class House {
    private String adress;

    Room kitchen = new Room(3, 4);
    Room bathroom = new Room(2, 2);

    Room[] rooms = {
            kitchen,
            bathroom
    };

    public double getArea() {
        double area = 0;

        for (int i = 0; i < rooms.length; i++) {
            area += rooms[i].area;
        }
        return area;
    }

    public String toString() {
        return
                "Dom ma wymiary: " + getArea();
    }
}
