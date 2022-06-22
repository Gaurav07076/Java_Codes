package com.topics.dataStructures.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class InbuiltExamples {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        deque.removeLast();
    }

}
