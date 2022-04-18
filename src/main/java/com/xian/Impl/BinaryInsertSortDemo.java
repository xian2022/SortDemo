package com.xian.Impl;

public class BinaryInsertSortDemo {
    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -10, -49, 21, 30, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        s1(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
    public static void binaryInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int low = 0;
            int height = i-1;
            while(low<=height) {
                int mid = (low+height)>>1;
                if (temp>=array[mid]){
                    low = mid + 1;
                } else {
                    height = mid - 1;
                }
            }
            if (i - low >= 0) System.arraycopy(array, low, array, low + 1, i - low);
            array[low] = temp;
        }
    }
    public static void s1(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int head = 0;
            int tail = i-1;
            while (head<=tail){
                int mid = (head+tail)>>1;
                if (temp>=array[mid]){
                    head = mid+1;
                } else {
                    tail = mid-1;
                }
            }
            if (i-head>=0) System.arraycopy(array,head,array,head+1,i-head);
            array[head] = temp;
        }
    }
}
