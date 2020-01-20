package com.kk;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

public class KlasaTestowa {
    public static void main(String[] args) {
        Stream<Double> random = (Stream.generate(Math::random);
        random.forEach(System.out::println);
    }
}
