package com.topics.stringAndStringBuilder;

public class  Comparison {
    public static void main(String[] args) {
        String a = "Gaurav";
        String b = "Gaurav";

        // comparator method - checks if ref variable are pointing to same objects
        System.out.println(a == b);

        String c = new String("Rahul");
        String d = new String ("Rahul");

        System.out.println(c == d);
        System.out.println(c.equals(d));


        System.out.println(c.charAt(2));

    }
}
