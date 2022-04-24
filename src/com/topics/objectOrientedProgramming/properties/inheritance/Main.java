package com.topics.objectOrientedProgramming.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
//
//        Box box2 = new Box(4.6,7.9,9.9);
//
//        Box box3 = new Box(box2);
//
//        System.out.println(box.l + " " + box.w + " " + box.h);
//
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//
//        System.out.println(box3.l + " " + box3.w + " " + box3.h);
//
//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.h + " " + box4.weight);

//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.w);

        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e. BoxWeight
        //hence,you should access to weight variables
        //this also means, that the ones you are trying to access should be initialised
        //but here,when the obj itself is of type parent class, how will you call the
        //constructor of child class
        //this is why error
        //BoxWeight box6 = new Box(2,3,4);

        BoxPrice box7 = new BoxPrice();

        BoxPrice box8 = new BoxPrice(5,8,200);

        Box.greeting();

    }
}
