package com.topics.objectOrientedProgramming.properties.polymorphism;

public class Circle extends Shapes{

    //this will run obj of Circle is created
    //hence it is overriding the parent method
    @Override  //this is called Annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
