package com.topics.algorithms.sortingAlgorithms.Questions;


import java.util.ArrayList;
import java.util.List;

//cyclicSort Q04
public class RepeatedNumbers {
    public static void main(String[] args) {
        int[] arr= {4,5,2,5,3,3,6,1,4};
        System.out.println(findDuplicates(arr));

    }
    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1 ;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index<arr.length;index++){
            if(arr[index]!=  index+1){
                ans.add(arr[index] );
            }
        }
        return ans;
    }

        static void swap( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }



