package com.topics.algorithms.recursion.arrays;

import java.util.ArrayList;

public class FindElements_LinearSearch {
    public static void main(String[] args) {
        int[] arr= {2,3,1,4,4,5};
        System.out.println(find(arr,4,0));
        System.out.println(findIndex(arr,4,0));
        System.out.println(findIndexLast(arr,4,arr.length-1));
        findAllIndex(arr,4,0);
        System.out.println(list);
        System.out.println(findAllIndex(arr,4,0,new ArrayList<>() ));

        System.out.println(findAllIndex2(arr, 4,0));

    }

    static boolean find(int[] arr, int target,int index){
        if (index == arr. length){
            return false;
        }
        return arr[index] == target || find (arr,target,index+1);
    }

    static int findIndex(int[] arr, int target,int index){
        if (index == arr. length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);

        }
    }

    static int findIndexLast(int[] arr, int target,int index){
        if (index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr,target,index-1);

        }
    }


    static ArrayList<Integer> list = new ArrayList();
    static void findAllIndex(int[] arr, int target,int index){
        if (index == arr. length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    // if you don't want to use a parametre of outside the list
    static ArrayList findAllIndex(int[] arr, int target,int index,ArrayList<Integer> list){
        if (index == arr. length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);

    }

    //Taking the arraylist inside the function call
    static ArrayList findAllIndex2(int[] arr, int target,int index){
        ArrayList<Integer> l = new ArrayList<>();

        if (index == arr. length){
            return l;
        }

        //this will contain answer for that function call only
        if(arr[index] == target){
            l.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1,list);
        l.addAll(ansFromBelowCalls);

        return l;
    }


}
