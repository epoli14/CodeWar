package com.codewars.kata.KYU_8;

import java.util.Random;

public class Random_4_digits {

    public static void main(String[] args) {

        int num = 0;
        int [] senha = new int [100];

        for (int i=0;i<100;i++){
            num = randomFourNumbers();
            if ((num > 1000) & (num < 9999)){
                System.out.println(num);
            }

        }

    }

    public static int randomFourNumbers(){
        Random rand = new Random();

        int number = rand.nextInt(9999);

        return number;
    }
}
