package com.kk;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("=============================================ZADANIE1=============================================");
        List<Integer> num = Arrays.asList(1,3,4,8,9,13,14);
        Stream<Integer> stream2 = num.stream();

        Stream<Integer> filStream = stream2
                .filter(x -> x%2==1)           //zostawia liczby nieparzyste
                .map(x -> x*10);               // przemnożenie przefiltrowanych liczb przez 10
//        Long numberOfElements=stream2.count(); // zliczenieliczby elementów -> count() kończy strumień i nie możemy na nim wywoływać metod

        List<Integer> num2 = filStream
                .parallel() // wykonywanie równoległe
                .peek(System.out::println)     // wywolanie metody na kazdym elemencie strumienia
                .collect(Collectors.toList()); //collect kończy stream

        System.out.println("List of Integers from task 1 from list: ");

        for (Integer n :num2
             ) {
            System.out.println(n);
        }

        System.out.println("=============================================ZADANIE2=============================================");

        List<String> txt = Arrays.asList("ala", "samochód", "kot", "aleksandra", "pies", "azor");

        txt
                .stream()
                .filter(x -> x.startsWith("a"))
                .map(x -> x.replaceFirst(x.substring(0,1), x.substring(0,1).toUpperCase()))
                .forEach(System.out::println);

        System.out.println("=============================================ZADANIE3=============================================");

        DoubleStream listaDouble = new Random().doubles();
        List<Double> doubleList = listaDouble
                .limit(10)
                .map(x -> x*2-1)
                .filter(x -> x<0.0)
                .boxed()
                .collect(Collectors.toList());

        for (Double x:doubleList) {
            System.out.println(x);
        }

        }

    }


