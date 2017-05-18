package com.problems;

/**
 * Created by mac on 18/05/2017.
 */
public class Fibonacci {
    public void bySimpleMethod(int n){
        int a = 0, b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for(int i = 1; i <= n-2; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void byRecursion(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(recursion(i) + " ");
        }
    }

    private int recursion(int i) {
        if(i == 1 || i == 2) {return 1;}
        else {
            return recursion(i - 1) + recursion(i - 2);
        }
    }
}
