package com.kk;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IntStream intstream = IntStream.range(0,10);
        System.out.println("INTS: ");
        intstream.forEach(System.out::println);

        System.out.println("=========================================================");

        DoubleStream doubles = DoubleStream.of(1,2,3);
        System.out.println("Doubles: ");
        doubles.forEach(System.out::println);

        System.out.println("=========================================================");

        DoubleStream randomDoubles = new Random().doubles();
        System.out.println("Radnom doubles: ");
        randomDoubles.limit(5).forEach(System.out::println);

        System.out.println("=========================================================");

        IntStream randomInts = new Random().ints();
        System.out.println("Random Ints: ");
        randomInts.limit(50).forEach(System.out::println);

        System.out.println("=========================================================");

        DoubleStream liczbyLosowe = new Random().doubles();

        List<Double> listaLosowych = liczbyLosowe
                .limit(10)
                .map(x -> x*2-1)
                .filter(x -> x<0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("RandomDoubles with map: ");

        for (Double x: listaLosowych) {
            System.out.println(x);
        }
    }
}
