package com.xian.Impl;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
    public static void quickSort(int[] array){
        subSort(array,0, array.length-1);
    }

    private static void subSort(int[] array, int start, int end) {
        if (start<end){
            int base = array[start];
            int head = 0;
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
            swap(array,start,tail);
            subSort(array,start,tail);
            subSort(array,tail+1,end);
        }
    }

    private static void swap(int[] array, int head, int tail) {
        int temp = array[head];
        array[head] = array[tail];
        array[tail] = temp;
    }
}
