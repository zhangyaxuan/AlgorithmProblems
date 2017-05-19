package com.problems.stack;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mac on 18/05/2017.
 */
public class MyStackByList {
    private LinkedList<Object> list = new LinkedList<Object>();
    public MyStackByList(){}

    public Object pop(){
        return list.removeFirst();
    }

    public void push(Object obj){
        list.addFirst(obj);
    }

    public Object peek(){
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
