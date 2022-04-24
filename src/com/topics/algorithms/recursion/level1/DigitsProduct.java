package com.topics.algorithms.recursion.level1;

public class DigitsProduct {
    public static void main(String[] args) {
        int ans = prodOfDigits(1532);
        System.out.println(ans);

    }

    static int prodOfDigits(int n){
        if (n%10 == n){
            return n;
        }

        return n%10 * prodOfDigits(n/10);
    }

}
