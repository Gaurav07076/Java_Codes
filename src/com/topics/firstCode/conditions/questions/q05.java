package com.topics.firstCode.conditions.questions;

public class q05 {
    public static void main(String[] args) {
        pattern5(5);

    }
    static void pattern5(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row >n ? 2* n - row : row;
            //for every row, run the col
            for (int col = 1; col <=totalColsInRow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add new line
            System.out.println();

        }


    }
}
