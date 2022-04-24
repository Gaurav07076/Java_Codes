package com.topics.objectOrientedProgramming.introduction;

public class Main {
    public static void main(String[] args) {
        //store 5 roll nos
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of % students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];



        // just declaring
        Student kunal = new Student();
        System.out.println(kunal);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

//        kunal.rno = 13;
//        kunal.name = "Kunak kushwaha";
//        kunal.marks = 88.5f;

        kunal.greeting();

        kunal.changeName("abc");
        kunal.greeting();

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
    }
}

// create a class
// for every single student
class Student{
    int rno ;
    String name;
    float marks;

    // we need a way to add the values of the above
    // properties object by object
//    Student (){
//        this.rno = 13;
//        this.name = "Kunak kushwaha";
//        this.marks = 88.5f;
//
//    }

    void greeting(){
        System.out.println("Hello my name is" + name);
    }

    void changeName(String newName){
        name = newName;
    }


    // Student a = new Student(17,"a",89.4f);
    // here this will be replaced with a
    Student(int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student(){
        // this is how you call a constructor from another constuctor
        //internally: new Student (13, "default person",100.0f);
        this(13,"default person",100.0f);
    }

    
}
