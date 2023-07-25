package com.codewars.kata.KYU_7;

/**
 * In this kata you should simply determine, whether a given year is a leap year or not. In case you don't know the rules, here they are:
 *
 * years divisible by 4 are leap years
 * but years divisible by 100 are not leap years
 * but years divisible by 400 are leap years
 * Additional Notes:
 *
 * Only valid years (positive integers) will be tested, so you don't have to validate them
 * Examples can be found in the test fixture.
 *
 *
 * @author Eduardo Poli
 * @version 1.0
 * @date 24/07/23
 *
 * Currently, studing about Collections
 *
 */
public class Leap_Years {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {

        return year % 100 == 0 ? year % 4 == 0 : year % 400 == 0;

    }

}
