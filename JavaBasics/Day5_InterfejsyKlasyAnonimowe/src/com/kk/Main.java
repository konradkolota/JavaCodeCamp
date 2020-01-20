package com.kk;

import com.kk.animal.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Atackable> list = getList();
        sortList(list);
        printList(list);
    }
//        Dog d1 = new Dog("Adaś", 9);
//        Dog d2 = new Dog("Stefan", 4);
//        Dog d3 = new Dog("Gienek", 10);
//        Dog d4 = new Dog("Tadzik", 21);
//        Dog d5 = new Dog("Józek", 7);
//        Dog d6 = new Dog("Czesiek", 2);
//        List <Dog> dogList = new ArrayList<>();
//        dogList.add(d1);
//        dogList.add(d2);
//        dogList.add(d3);
//        dogList.add(d4);
//        dogList.add(d5);
//        dogList.add(d6);
//
//        dogList.sort(new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
//        System.out.println(dogList);
//
//        dogList.sort(new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });
//
//        System.out.println(dogList);
//
//        Cat c1 = new Cat("Name1", 123);
//        Cat c2 = new Cat("Name2", 120);
//        Cat c3 = new Cat("Name3", 40);
//        Cat c4 = new Cat("Name4", 96);
//        Cat c5 = new Cat("Name5", 65);
//        Cat c6 = new Cat("Name6", 110);
//        Cat c7 = new Cat("Name7", 111);
//        List <Cat> catList = new ArrayList<>();
//        catList.add(c1);
//        catList.add(c2);
//        catList.add(c3);
//        catList.add(c4);
//        catList.add(c5);
//        catList.add(c6);
//        catList.add(c7);
//
//        catList.sort(new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                if(o2.getLength() > o1.getLength()){
//                    return 1;
//                }else return -1;
//            }
//        });
//
//        System.out.println(catList);
//
//        catList.sort(new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                if(o2.getLength() < o1.getLength()){
//                    return 1;
//                }else return -1;
//            }
//        });
//
//        System.out.println(catList);
//
//    List<Atackable> attackList = getList(doggy, kat, tiger, lewek);

    private static void sortList(List<Atackable> list){
        list.sort(new Comparator<Atackable>() {
            @Override
                    public int compare(Atackable o1, Atackable o2) {
                        int ap1 = o1.attack();
                        int ap2 = o2.attack();
                        if (ap1 > ap2) {
                    return 1;
                }else if(ap2 > ap1){
                    return -1;
                }else return 0;

            }
        });
    }

    private static List<Atackable> getList() {
        Dog doggy = new Dog("Miszka", 15);
        Cat kat = new Cat("Koteł");
        Tiger tiger = new Tiger("Mike Tyson", 2);
        Lion lewek = new Lion("Lewek");

        List<Atackable> attackList = new ArrayList<>();
        attackList.add(doggy);
        attackList.add(kat);
        attackList.add(tiger);
        attackList.add(lewek);
        return attackList;
    }

    public static void printList(List<Atackable> list) {
        list.forEach(System.out::println);

    }

}