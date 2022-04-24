package com.topics.objectOrientedProgramming.acess;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num ) {
        this.num = num;

    }
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    ///we will go in detail of how to create it in hashmap lecture
    //it basically gives a number representation of an object
    //unique representation of an obj via a number
    //Ti gives us a random number to identify if an object is same object or
    // different object
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    //checks whether the value og the two object is same or not
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //String Representation
    @Override
    public String toString() {
        return super.toString();
    }

    //Called when Garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = obj;
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());


        ObjectDemo obj3 = new ObjectDemo(34, 56.8f);
        ObjectDemo obj4 = new ObjectDemo(12, 78.9f);

        if(obj3 == obj4){
            System.out.println("obj 1 is equals to obj2");
        }

        if(obj3.equals(obj4)){
            System.out.println("obj 1 is equals to obj2");
        }
    }
}
