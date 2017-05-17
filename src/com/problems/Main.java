package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bubbleSort(new Integer[]{5, 9, 2, 1, 3, 6, 8, 7, 4, 0});
    }

    private static void bubbleSort(Integer[] numbers){
        for(int i=0; i < numbers.length; i++){
            int min = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < min){
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
