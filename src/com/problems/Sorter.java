package com.problems;

import java.util.Arrays;

/**
 * Created by mac on 17/05/2017.
 */
public class Sorter {

    public void insertionSort(Integer[] numbers){
        int temp;
        int times = 0;
        for(int i=1; i<numbers.length; i++){
            int j = i;
            if (numbers[j] < numbers[j-1]) {
                temp = numbers[j];
                while (j>0 && temp < numbers[j -1]) {
                    numbers[j] = numbers[j-1];
                    j--;
                }
                numbers[j] = temp;
                times++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Selection sort times:" + times);
    }

    public void selectionSort(Integer[] numbers){
        int times = 0;
        for(int i=0; i<numbers.length; i++){
            int minIndex = i;
            for(int j=i+1; j<numbers.length; j++){
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
                times++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Selection sort times:" + times);
    }

    public void bubbleSort(Integer[] numbers){
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

    public void quickSort(Integer[] numbers) {
        
    }
}
