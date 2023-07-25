package com.codewars.kata.KYU_8;

public class KYU_8_ConcatenateString {

    public static void main(String[] args) {
        System.out.println(countingSheep(10));
    }
    public static String countingSheep(int num){

        if (num <= 0){
            return "";
        }else {
            String sheep = "";
            for (int i = 0; i <= num; i++) {
                sheep += i + " sheep...";
            }
            //System.out.println(sheep);
            return sheep;
        }
    }
}
