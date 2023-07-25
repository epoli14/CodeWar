package com.codewars.kata.KYU_8;

public class KYU_8_RemoveStringSpace {

    public static void main(String[] args) {

        String nome = "Eduardo Henrique Urbano de Poli";

        System.out.println(noSpace(nome));
    }

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
