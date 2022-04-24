package com.topics.objectOrientedProgramming.acess;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45,"Abc");
        int n = obj.num;


        // to check whether a particular thing is an instance of
        System.out.println(obj instanceof A);

        //to get data of classes, constructors etc, For eg.
        //it is stored in heap
        System.out.println(obj.getClass());
    }
}
