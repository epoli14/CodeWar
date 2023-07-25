package com.codewars.kata.KYU_6;

public class Sum_of_Digits_Digital_Root {

    /*
    *
    * <h1> Sum of Digits / Digital Root </h1>
    * Given n, take the sum of the digits of n. If that value has more than one digit,
    * continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
    *
    * @autor codewars
    * @version 1.0
    * @since 21/07/23
    * Examples:
    * 16  -->  1 + 6 = 7
    * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
    *
     */

    public static void main(String[] args) {


        System.out.println(digital_root(290386));
    }

    /**
     * Esse método é um validador para o número entre 1-9
     * @param n Este é o número que será reduzido
     * @return É o resultado da soma da última redução
     */
    public static int digital_root(int n) {

        while(n > 9){
            n = reduce_root(n);
        }

        return n;
    }

    /**
     * Esse método é utilizado para calcular a redução de um número n
     * @param n Este é o número que será reduzido até sobrar somente um número entre 0 - 10
     * @return É o resultado da soma da última redução
     */
    public static int reduce_root(int n){
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

}
