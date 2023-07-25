package com.codewars.kata.KYU_8;

public class KYU_8_SumArray {

    public static double sum(double[] numbers) {

        double sum = 0;
        for (int i=0;i<numbers.length;i++){
            sum+= numbers[i];
        }
        return sum;
    }

}
