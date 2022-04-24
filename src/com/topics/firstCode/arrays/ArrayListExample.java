package com.topics.firstCode.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        /*syntax
        ArrayList<Integer> list = new ArrayList<>(intialCapacity:10);
        */
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(64);
        list.add(4);
        list.add(644);
        list.add(64);
        list.add(646);
        list.add(67);
        list.add(85);
        list.add(99);
        list.add(20);
        list.add(54);
        list.add(64);
        list.add(44);
        list.add(4);
        System.out.println(list);
        System.out.println(list.contains(44));
        list.set(0,99);
        System.out.println(list);
        list.remove(2);

        //input
        for(int i =0; i<5;i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }
    }
}
