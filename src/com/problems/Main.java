package com.problems;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bubbleSort(new Integer[]{6, 9, 2, 0, 1, 8, 5, 4, 7, 3});
    }


    private static void bubbleSort(Integer[] numbers){
        int times = 0;
        for(int i=0; i < numbers.length; i++){
            for(int j = numbers.length-1; j > i; j--){
                if(numbers[j] < numbers[j-1]){
                    int min = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = min;
                    times++;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Bubble sort times:" + times);
    }

}
