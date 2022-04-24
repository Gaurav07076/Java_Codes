package com.topics.algorithms.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
         bubble(a);
        System.out.println(Arrays.toString(a));
        bubblerec(a,4,0);
        System.out.println(Arrays.toString(a));

    }

    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - 1; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means
            // the array is sorted hence stop the program
            if (!swapped) {//!false = true
                break;
            }
        }
    }


    //bubble sort using recursion
    static void bubblerec(int[] arr, int r, int c){
        if (r == 0){
            return;
        }
        if (c < r) {
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblerec(arr,r, c + 1);
        } else {
            bubblerec(arr,r-1,0);
        }
    }
}
