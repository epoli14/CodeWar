package com.codewars.kata.KYU_7;

public class KYU_7_GetTheMiddleCharacter {

    public static void main(String[] args) {

        String wr = "test";

        System.out.println(getMiddle(wr));

    }

    public static String getMiddle(String word) {

        String newWord;
        int half = word.length() / 2;

        if (word.length() % 2 == 0){
            newWord = word.substring(half - 1, half + 1);
        }else{
            newWord = String.valueOf(word.charAt(half));
        }
        return newWord;
    }
}
