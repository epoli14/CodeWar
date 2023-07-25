package com.codewars.kata.KYU_8;

import java.util.Scanner;

/**
 * @author Eduardo Poli
 * @version 1.0
 * @date 240723
 * Find the sum of all multiples of n below m
 *
 * Keep in Mind
 * n and m are natural numbers (positive integers)
 * m is excluded from the multiples
 * Examples
 * Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
 * Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
 * Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
 * Kata.sumMul(4, -7)  // throws IllegalArgumentException
 */
public class Sum_of_Multiples {

    public static void main(String[] args) {

        System.out.println(SumOfMultiples(2,9));

    }

    public static int SumOfMultiples(int n, int m){

        int sum = 0;
        if (n <= 0 || m <= 0){
            throw new IllegalArgumentException();
        } else {
            for (int i = n; i < m; i += n) {
                sum += i;
                System.out.println("I: " + i);
                System.out.println("Sum: " + sum);
            }
            return sum;
        }
    }

}
