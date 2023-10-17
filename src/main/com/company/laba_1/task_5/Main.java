package main.com.company.laba_1.task_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minElementsAmountToRemove(new int[]{1, 8, 4, 2, 7, 6, 3, 5}));
    }

    public static int minElementsAmountToRemove(int[] arr) {

        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return arr.length - max(dp);
    }

    public static int max(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
