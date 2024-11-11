package com.codewars.kata.KYU_8;

public class InvertValues {

    public static void main(String[] args) {

        int [] nums = new int []{1, 2, 3, 4, 5};

        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * -1;
        }

        for (int j = 0; j < nums.length; j++){
            System.out.println(nums[j]);
        }

        for (int j = 1; j < 17; j++){
            System.out.println(j + " - ");
        }


    }
}
