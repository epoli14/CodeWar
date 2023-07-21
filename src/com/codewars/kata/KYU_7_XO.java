package com.codewars.kata;

public class KYU_7_XO {

    public static void main(String[] args) {

        //System.out.println(XO("Mensagemeememe"));

    }

    public static boolean XO(String mensagem){

        return mensagem.toLowerCase().chars().filter(ch -> ch == 'e').count() == mensagem.toLowerCase().chars().filter(ch -> ch == 'o').count();
    }
}
