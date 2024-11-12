package com.codewars.kata.KYU_7;

public class SumOfMatrix {

    public static void main(String[] args) {

        //final int[][] matrix = new int[][]{{12}};
        //final int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        final int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //final int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println(matrix[0].length);
        System.out.println(diagonalSum(matrix));
    }


    public static int diagonalSum(final int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            System.out.println(matrix[i][i]);
        }
        return sum;

    }


}
