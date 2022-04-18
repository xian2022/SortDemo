package com.xian;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
    public static void quickSort(int[] array) {
        subSort(array,0,array.length-1);
    }
    public static void subSort(int[] array , int start , int end) {
        if (start<end){
            int base = array[start];
            int head = start;
            int tail = end + 1;
            while (true) {
                while (head < end && array[++head] - base <= 0);
                while (tail > start && array[--tail] - base >= 0);
                if (head < tail) {
                    swap(array,head,tail);
                } else {
                    break;
                }
            }
            swap(array, start , tail);
            subSort(array, start, tail - 1);
            subSort(array, tail + 1, end);
        }
    }
    public static void swap(int[] array,int i ,int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
