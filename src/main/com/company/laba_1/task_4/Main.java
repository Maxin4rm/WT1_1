package main.com.company.laba_1.task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 7, 8, 9, 11};
        List<Integer> primeElementsIndexes = getPrimeNumbersIndexes(array);
        System.out.println(primeElementsIndexes.size() > 0 ? primeElementsIndexes :
                "There are no prime numbers in the array");
    }

    public static List<Integer> getPrimeNumbersIndexes(int[] arr) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    static boolean isPrime(int x) {
        if (x == 2) {
            return true;
        }
        if (x <= 1 || x % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}