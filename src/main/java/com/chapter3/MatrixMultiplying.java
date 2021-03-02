package com.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplying {

    public static int[][] readMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number of rows in a matrix: ");
        int row = in.nextInt();
        System.out.print("Please enter a number of columns in a matrix: ");
        int col = in.nextInt();
        int[][] matrix = new int[row][col];
        System.out.print("Please enter elements of the matrix divided by space: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    public static void multipleMatrix(int[][] firstMat, int[][] secondMat) {
        int[][] resultMatrix = new int[firstMat.length][secondMat[0].length];
        for (int row = 0; row < firstMat.length; row++) {
            for (int col = 0; col < secondMat[0].length; col++) {
                for (int i = 0; i < secondMat.length; i++) {
                    resultMatrix[row][col] += firstMat[row][i] * secondMat[i][col];
                }
            }
        }
        System.out.println(Arrays.deepToString(resultMatrix));
    }
}
