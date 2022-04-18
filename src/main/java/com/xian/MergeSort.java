package com.xian;

public class MergeSort {
    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        mergeSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
    public static void mergeSort(int[] data) {
        sort(data,0,data.length-1);
    }

    private static void sort(int[] data, int left, int right) {
        if (left<right) {
            int center = (left+right)>>1;
            sort(data,left,center);
            sort(data, center+1, right);
            merge(data,left,center,right);
        }
    }

    private static void merge(int[] data, int left, int center, int right) {
        int[] newArray = new int[data.length];
        int mid = center + 1;
        int third = left;
        int temp = left;
        while (left<=center && mid<=right) {
            if (data[left]- data[mid] <= 0) {
                newArray[third++] = data[left++];
            } else {
                newArray[third++] = data[mid++];
            }
        }
        while (mid <= right) {
            newArray[third++] = data[mid++];
        }
        while (left <= center) {
            newArray[third++] = data[left++];
        }
        while (temp <= right) {
            data[temp] = newArray[temp++];
        }
    }
}
