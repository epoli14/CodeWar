package com.codewars.kata.KYU_8;
/*
Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.
Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
Write a code that gives out the total amount for different days(d).
 */
public class KYU_8_RentingCar {


    public static int rentCarCost(int d){

        int discount=0;
        if (d >= 7){
            discount=50;
        }else if(d >= 3){
            discount=20;
        }
        return (d * 40) - discount;
    }
}
