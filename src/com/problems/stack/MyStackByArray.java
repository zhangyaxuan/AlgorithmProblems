package com.problems.stack;

import java.util.EmptyStackException;

/**
 * Created by mac on 21/05/2017.
 */
public class MyStackByArray {
    private Object[] myStack;
    private int top = -1;
    private int capacity;

    public MyStackByArray(int size){
        myStack = new Object[size];
        this.capacity = size;
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return myStack[top--];
    }

    public void push(Object obj){
        if(top == capacity){
            throw new StackOverflowError();
        }
        myStack[++top] = obj;
    }

    public Object peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return myStack[top];
    }

}
