package com.topics.dataStructures.stack;

public class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int index = -1;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this.data = new int[DEFAULT_SIZE];
    }

    public int size (){
        return (index + 1);
    }

    public void push(int value) throws IllegalStateException{
        if (size() == data.length){
            throw new IllegalStateException("StackOverflowException");
        }
        index++;
        data[index] = value;
    }

    public boolean isFull(){
        return index == data.length - 1;
    }

    public boolean isEmpty(){
        return index == -1;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack!!");
        }
        return data[index--];
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot peek an empty stack!!");
        }
        return data[index];
    }
}
