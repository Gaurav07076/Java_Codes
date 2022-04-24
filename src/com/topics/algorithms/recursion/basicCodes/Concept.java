package com.topics.algorithms.recursion.basicCodes;

public class Concept {
    public static void main(String[] args) {
        fun(5);

    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
      //  fun(n--); this will give stack overflow because it pass the value first and
      //  then subtract meaning everytime 5 is passed.
        fun(--n);
       // --n first subtact and then passes the value
    }
}
