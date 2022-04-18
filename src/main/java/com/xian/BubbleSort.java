package com.xian;

import java.sql.Time;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        long l = System.currentTimeMillis();
        bubbleSort(data);
        System.out.println(System.currentTimeMillis()-l+"s");
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[i]>=array[i+1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
