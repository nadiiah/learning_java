package com.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplying {

    public static int[][]  readMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number of rows in a matrix: ");
        int row = in.nextInt();
        System.out.print("Please enter a number of columns in a matrix: ");
        int col = in.nextInt();
        int[][] matrix = new int[row][col];
        System.out.print("Please enter elements of the matrix divided by space: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

    public static void multipleMatrix(int [][] firstMat, int [][] secondMat){
        int [][] resultMatrix = new int [firstMat.length][secondMat[0].length];
        for (int i=0; i<firstMat[i].length; i++){
            for (int j=0; j<firstMat.length; j++){
                for (int k = 0; k < secondMat[k].length; k++) {
                    for (int l = 0; l < secondMat.length; l++) {
                    resultMatrix[i][l] = firstMat[i][j]*secondMat[k][l]+firstMat[i][j+1]*secondMat[k+1][l];
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(resultMatrix));
    }
}
