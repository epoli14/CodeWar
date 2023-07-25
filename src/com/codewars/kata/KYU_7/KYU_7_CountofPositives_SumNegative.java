package com.codewars.kata.KYU_7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class KYU_7_CountofPositives_SumNegative {

    public static void main(String[] args) {

        int [] informationArray = {10, 20, 50, 20, -1, -10, -50, -25};

        System.out.println(Arrays.toString(countPositivesSumNegatives(informationArray)));
    }

    public static int[] countPositivesSumNegatives(int[] input){
        int countOfPositive = 0;
        int sumNegative = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] >= 0){
                countOfPositive++;
            }else{
                sumNegative-= input[i];
            }
        }
        sumNegative*=-1;
        int [] newArray = {countOfPositive, sumNegative};
        return newArray;
    }



}
