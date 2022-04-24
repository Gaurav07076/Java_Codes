package com.topics.firstCode.conditions.questions;

public class q28 {
    public static void main(String[] args) {
        pattern28(5);

    }
    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1 ; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");

            }

            //for every row, run the col
            for (int col = 1; col <=totalColsInRow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add new line
            System.out.println();

        }
    }
}

