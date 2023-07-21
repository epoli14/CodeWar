package com.codewars.kata;

public class KYU_7_Isograms {

    public static void main(String[] args) {

        System.out.println(isIsogram("Dermatoglyphics"));
    }

    public static boolean isIsogram(String str) {

        boolean repeat = false;

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i));
            for (int j = i+1; j < str.length(); j++){
                repeat = (str.charAt(i) == str.charAt(j)) ? true : false;

                if (repeat == true){
                    return repeat;
                }
            }
        }

        return repeat;
    }
}
