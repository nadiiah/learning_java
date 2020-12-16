package com.chapter3;

public class Runner {

    public static void main(String[] args) {
        int counter = 0;
        int amountOfRows = 0;
        int amountOfColumns = -1;
        int firstMat[][];
        int secondMat[][];

        while ((amountOfColumns != amountOfRows) && (counter < 3)) {
            counter++;
            firstMat = MatrixMultiplying.readMatrix();
            secondMat = MatrixMultiplying.readMatrix();
            amountOfColumns = firstMat[0].length;
            amountOfRows = secondMat.length;
            if (amountOfColumns != amountOfRows) {
                System.out.println("Number of columns of the first matrix is not equal to the number" +
                        "of rows of the second matrix.");
                System.out.println("Please retry!");
            } else {
                MatrixMultiplying.multipleMatrix(firstMat, secondMat);
            }
        }
        if (amountOfColumns != amountOfRows) {
            System.out.println("Sorry!");
        }
    }
}
