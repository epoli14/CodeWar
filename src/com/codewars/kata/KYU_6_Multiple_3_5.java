package com.codewars.kata;

public class KYU_6_Multiple_3_5 {

    public static void main(String[] args) {

        System.out.println("Soma final: " + solution(10));
    }

    public static int solution(int number){
        int sum=0;
        if (number < 0){
            return 0;
        }else{
            for (int i = 1; i < number; i++) {

                if ((i%3==0) || (i%5==0)){
                    System.out.println(i);
                    sum+=i;
                    System.out.println("Somando: " + sum);
                }
            }
            return sum;
        }

    }
}
