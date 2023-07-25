package com.codewars.kata.KYU_8;

public class KYU_8_TrafficLights {


    public static String updateLight(String current){
        switch (current){
            case "Green":
                return "Yellow";
            case "Yellow":
                return "Red";
            case "Red":
                return "Green";
            default:
                return "blink orange";
        }
    }

}
