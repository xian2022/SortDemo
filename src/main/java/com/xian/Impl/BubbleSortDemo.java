package com.xian.Impl;

public class BubbleSortDemo {
    public static void main(String[] args) {

    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j]>=array[j+1]) {
                    int temp = array[j+1];
                    array[j+1]=array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
