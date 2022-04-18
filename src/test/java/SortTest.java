import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SortTest {
    public static void main(String[] args) {
        int[] data = {9, -16, 21, 23, -30, -49, 21, 30, 30};
        quickSort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void binaryInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int head = 0;
            int tail = i - 1;
            while (head <= tail) {
                int mid = (head + tail) >> 1;
                if (temp >= array[mid]) {
                    head = mid + 1;
                } else {
                    tail = mid - 1;
                }
            }
            if (i - head >= 0) System.arraycopy(array, head + 1, array, head, i - head);
            array[head] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array) {
        subSort(array, 0, array.length - 1);
    }

    private static void subSort(int[] array, int start, int end) {
        if (start < end) {
            int base = array[start];
            int low = start;
            int height = end + 1;
            while (true) {
                while (low < end && array[++low] - base <= 0) ;
                while (height > start && array[--height] - base >= 0) ;
                if (low < height) {
                    swap(array, low, height);
                } else {
                    break;
                }
            }
            swap(array, start, height);
            subSort(array, start, height - 1);
            subSort(array, height + 1, end);
        }
    }

    private static void swap(int[] array, int low, int height) {
        int temp = array[low];
        array[low] = array[height];
        array[height] = temp;
    }

    private String s1;
    private String s2;

    @Test
    public void stringTest() {
        String s = s1 + s2;
        System.out.println(s);
    }

    @Test
    public void wrapperTest() {
        int n1 = 128;
        int n2 = 128;
        System.out.println(n1 == n2);
        wrapperObject(n1, n2);
    }

    private static void wrapperObject(Integer number1, Integer number2) {
        System.out.println(number1 == number2);
    }
    @Test
    public void test() {
        new Thread(()->{
            SingleTon instance1 = SingleTon.getInstance();
            System.out.println(instance1);
        }).start();
        new Thread(()->{
            SingleTon instance2 = SingleTon.getInstance();
            System.out.println(instance2);
        }).start();
        new TreeMap<>((x,y)->{
            return 0;
        });
    }
}
