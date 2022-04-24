package com.topics.objectOrientedProgramming.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        Integer num = 45;

        swap (a,b);
        System.out.println(a + " " + b);

        //the difference is num is created as an object while a is not.

//        final int bonus = 2;
//        bonus = 3;   //will show error

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";
        //when a non primitive is final, you cannot reassign it.



        //finalise
        A obj;

        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name");
        }


    }

    static void swap(Integer x , Integer y){
        Integer temp = x;
        x = y;
        y = temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
