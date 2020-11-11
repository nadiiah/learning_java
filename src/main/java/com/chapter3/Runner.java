package com.chapter3;

public class Runner {

    public static void main(String[] args) {
        //StringUtil.workWithEnteredString(StringUtil.enterAndReadText());
        //ArrayUtils.learnArrays();
        /*int[] enteredArray = ArrayUtils.readArray();
        BubbleSorting.sortNumbers(enteredArray);
        ArrayUtils.trySorting(enteredArray);
        ArrayUtils.copyArray(enteredArray);
        ArrayUtils.fillArrayValues(enteredArray);*/
        int firstMat[][] = MatrixMultiplying.readMatrix();
        int secondMat[][] = MatrixMultiplying.readMatrix();
        if (firstMat[0].length != secondMat.length) {
            System.out.println("Number of columns of the first matrix is not equal to the number" +
                    "of rows of the second matrix.");
            System.out.println("Please retry!");
        }
        MatrixMultiplying.multipleMatrix(firstMat, secondMat);

    }
}
