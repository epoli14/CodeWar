package com.codewars.kata.KYU_7;

import java.util.Arrays;

public class OddOrEven {

    public static void main(String[] args) {

        int [] n = new int[] {2, 5, 34, 6};

        System.out.println(oddOrEven(n));

    }

    public static String oddOrEven (int[] array) {

        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";

    }
}
