package com.problems;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sorter sorter = new Sorter();
        sorter.bubbleSort(new Integer[]{6, 9, 2, 0, 1, 8, 5, 4, 7, 3});
        sorter.selectionSort(new Integer[]{6, 9, 2, 0, 1, 8, 5, 4, 7, 3});
        sorter.insertionSort(new Integer[]{6, 9, 2, 0, 1, 8, 5, 4, 7, 3});
        sorter.quickSort(new Integer[]{6, 9, 2, 0, 1, 8, 5, 4, 7, 3});
    }


}
