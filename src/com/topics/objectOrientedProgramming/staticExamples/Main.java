package com.topics.objectOrientedProgramming.staticExamples;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal Kushwaha", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);

        System.out.println(kunal.name);

        System.out.println(kunal.population);
        System.out.println(rahul.population);


    }

    static void fun(){
        //greeting();
        // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances

        //to use first create an object. for eg.
        Main obj = new Main();
        obj.greeting();
        }
    //we know that something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello world");
    }
}

