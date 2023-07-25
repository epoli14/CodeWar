package com.codewars.kata.KYU_7;

public class KYU_7_SequenceOfInteger {

    public static void main(String[] args) {
        System.out.println(sequenceSum(2,2,2));
    }

    public static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        if (start > end){
            return 0;
        }else {
            for (int i = start; i <= end; i+=step) {
                sum+= i;
            }
            return sum;
        }

    }

}
