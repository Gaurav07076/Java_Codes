package com.topics.dataStructures.linkedList;

public class Main2 {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.display();

        list.insertLast(99);
        list.display();

        list.insertAfter(8,65);
        list.display();

        list.insertAfter(99,10);
        list.display();

    }
}
