package com.topics.firstCode.basicCodes;


class Abc{
    private int a,b;
    private Abc() {a=100;}
    Abc(int x){this();b=x;}
    void show(){
        System.out.println(a+" "+ b);
    }
}
public class asd {
    public static void main(String[] args) {
        Abc s1= new Abc(200);
        s1.show();
    }

}
