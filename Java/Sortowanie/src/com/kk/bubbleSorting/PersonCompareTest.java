package com.kk.bubbleSorting;

import java.util.Arrays;

public class PersonCompareTest {
    public static void main(String[] args) {
        Person[] person = new Person[6];

        person[0] = new Person("Stefan","Zgrzyt", 55);
        person[1] = new Person("Zbigniew","Nowak", 19);
        person[2] = new Person("Zbigniew","Nowak", 23);
        person[3] = new Person("Czesiek","Nowak", 33);
        person[4] = new Person("Julka","Kasztan", 18);
        person[5] = new Person("Aneta","Dąb", 76);

        Arrays.sort(person);

        for (Person o:person ) {
            System.out.println(o.name+" "+o.surname+", age:  "+o.age);
        }
    }
}
