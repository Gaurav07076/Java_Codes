package com.topics.firstCode.conditions.questions;

public class q31 {
    public static void main(String[] args) {
        pattern31(4);

    }
    static void pattern31(int n) {
        for (int row = 1; row <= 2*n-1; row++) {

            for (int col = 1; col <= 2*n-1; col++ ) {
                int atEveryIndex = n+1 - Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col));
                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();

        }
    }
}
