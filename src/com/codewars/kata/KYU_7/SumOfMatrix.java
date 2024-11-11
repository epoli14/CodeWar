package com.codewars.kata.KYU_7;

public class SumOfMatrix {

    public static void main(String[] args) {

        final int[][] matrix = new int[][]{{12}};
        //final int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        //final int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //final int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println(diagonalSum(matrix));
    }


    public static int diagonalSum(final int[][] matrix) {
        if (matrix[0].length + matrix[1].length > 0){

            System.out.println(matrix[0].length + matrix[1].length);

            int soma = 0, valor = 0, ignit = 0;

            for (int i = 0; i < matrix[0].length; i++) {

                for (int j = 0; j < matrix[1].length; j++) {

                    valor = matrix[i][ignit];

                    soma += valor;

                    break;

                }
            }

            return soma;
        }else
            return matrix[0][0];

    }


}
