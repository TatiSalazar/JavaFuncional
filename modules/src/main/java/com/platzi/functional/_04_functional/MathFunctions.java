package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };
        //System.out.println(squareFunction.apply(5));

        Function<Integer, Boolean > isOdd = x -> x % 2 == 1 ;

        Predicate<Integer> isEven = x -> x % 2 ==0;

        //System.out.println(isEven.test(4));

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;
        Student sinuhe = new Student(5.0);
        System.out.println(isApproved.test(sinuhe));
    }

    static int square ( int x ) {
        return x*x;
    }

    static class Student {
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return  calificacion;

        }
    }
}
