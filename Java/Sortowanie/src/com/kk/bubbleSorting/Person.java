package com.kk.bubbleSorting;

public class Person implements Comparable<Person> {

     String name;
     String surname;
     int age;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //A
//    @Override
//    public int compareTo(Person p) {
//        return this.name - p.name;
//    }

    //B
//    @Override
//    public int compareTo(Person p) {
//        return this.surname.compareTo(p.surname);
//    }

    //C
//    @Override
//    public int compareTo(Person p) {
//        if(this.surname.compareTo(p.surname) == 0){
//            return this.name.compareTo(p.name);
//        }else return this.surname.compareTo(p.surname);
//    }

    //D
    @Override
    public int compareTo(Person p) {
        if(this.surname.compareTo(p.surname) == 0){
            return this.name.compareTo(p.name);
        }else if(this.surname.compareTo(p.surname) == 0){
            return this.age - p.age;
        }else return this.surname.compareTo(p.surname);
    }

}
