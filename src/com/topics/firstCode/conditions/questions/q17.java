package com.topics.firstCode.conditions.questions;

public class q17 {
    public static void main(String[] args) {
        pattern17(5);

    }
    static void pattern17(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int c= row>n ? 2*n - row :row;
            for (int space = 0; space< n-c ; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col+" ");

            }

            System.out.println();

        }
    }
}
