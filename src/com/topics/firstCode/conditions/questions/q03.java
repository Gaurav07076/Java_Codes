package com.topics.firstCode.conditions.questions;

public class q03 {
    public static void main(String[] args) {
        pattern3(5);
    }


    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <=n+1-row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add new line
            System.out.println();

        }
    }
}
