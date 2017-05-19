package com.problems.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mac on 19/05/2017.
 */
public class MyStackByListTest {
    MyStackByList stack = new MyStackByList();
    @Before
    public void prepareTheStack(){
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("last");
    }
    @Test
    public void shouldGetOutTheLastElement(){
        assertThat(stack.pop(), is("last"));
        assertThat(stack.pop(), is("third"));
    }
    @Test
    public void shouldGetTheValueOfLastElement(){
        assertThat(stack.peek(), is("last"));
        assertThat(stack.pop(), is("last"));
    }
    @Test
    public void shouldPutNewElementToTheTop(){
        stack.push("new");
        assertThat(stack.peek(), is("new"));
    }
    @Test
    public void shouldBeEmptyAfterPopFourElements(){
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertThat(stack.isEmpty(), is(true));
    }
}
