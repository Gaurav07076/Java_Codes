package com.topics.objectOrientedProgramming.staticExamples;

class Test{
    String name;

    public Test(String name) {
        this.name = name;
    }
}

public class InnerClasses {


    public static void main(String[] name){
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
