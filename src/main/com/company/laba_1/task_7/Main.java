package main.com.company.laba_1.task_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {
                6, 4, 1, 2, 5, 9, 1
        };
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buff = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buff;
                }
            }
        }
        return arr;
    }
}
