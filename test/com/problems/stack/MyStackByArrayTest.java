package com.problems.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mac on 21/05/2017.
 */
public class MyStackByArrayTest {

    @Test
    public void testTheMethodsOfMyStackByArray() throws Exception {
        MyStackByArray stack = new MyStackByArray(3);
        assertThat(stack.isEmpty(), is(true));

        stack.push("first");
        stack.push("second");
        assertThat(stack.isEmpty(), is(false));
        assertThat(stack.pop(), is("second"));
        assertThat(stack.peek(), is("first"));
    }

}