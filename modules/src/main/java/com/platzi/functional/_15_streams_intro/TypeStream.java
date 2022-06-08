package com.platzi.functional._15_streams_intro;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.IntStream;

public class TypeStream {

    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0,x -> x +1);
        infiniteStream.limit(10)
                .parallel()
                .filter(x -> x%2 == 0)
                .forEach(System.out::println);
    }
}
