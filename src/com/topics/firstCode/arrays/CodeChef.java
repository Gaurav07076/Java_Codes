package com.topics.firstCode.arrays;

import java.util.Scanner;

public class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] s = new int[n];
            int[] d = new int[n];
            for (int j = 0; j < s.length ; i++){
                s[i] = sc.nextInt();
            }
            for (int k = 0; k < d.length ; k++){
                d[i] = sc.nextInt();
            }
            int count = 0;
            int p = 0;
            while ( p < s.length){
                if (s[p] == d[p]){
                    count ++;
                    p++;
                }
            }
            System.out.println(count);
        }
    }
}

