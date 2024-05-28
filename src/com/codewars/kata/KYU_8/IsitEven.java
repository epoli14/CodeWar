package com.codewars.kata.KYU_8;

import java.util.function.Predicate;

public class IsitEven {

    public static void main(String[] args) {

        Predicate<Double> isItEven = n -> n % 2 == 0;

        System.out.println(isItEven.test(1.0));
    }
}
