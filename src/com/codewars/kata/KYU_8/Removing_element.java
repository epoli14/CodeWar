package com.codewars.kata.KYU_8;

import java.util.ArrayList;

public class Removing_element {

    public static void main(String[] args) {

    }

    public static Object[] removeEveryOther(Object[] arr) {

        ArrayList<Object> elements = new ArrayList<>();

        for(int i = 0; i < elements.size(); i++){
            if (i % 2 != 0)
                elements.remove(i);
        }

        return elements.toArray();
    }
}
