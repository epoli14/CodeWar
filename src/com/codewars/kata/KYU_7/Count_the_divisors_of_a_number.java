package com.codewars.kata.KYU_7;

/**
 *
 * Count the number of divisors of a positive integer n.
 *
 * Random tests go up to n = 500000.
 *
 * Examples (input --> output)
 * 4 --> 3 // we have 3 divisors - 1, 2 and 4
 * 5 --> 2 // we have 2 divisors - 1 and 5
 * 12 --> 6 // we have 6 divisors - 1, 2, 3, 4, 6 and 12
 * 30 --> 8 // we have 8 divisors - 1, 2, 3, 5, 6, 10, 15 and 30
 * Note you should only return a number, the count of divisors.
 * The numbers between parentheses are shown only for you to see which numbers are counted in each case.
 */
public class Count_the_divisors_of_a_number {

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(5));
    }
    public static long numberOfDivisors(int n) {

        long div = 0;

        for(int i = 1; i <= n; i++){
            div += n % i == 0 ? 1 : 0;
        }
        return div;
    }

}
