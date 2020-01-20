package com.kk;

public class Person {

    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
        public void informacja() {
            System.out.println("Imię: " + firstName);
            System.out.println("Nazwisko: " + lastName);
            System.out.println("Wiek: " + age);
        }
    }

