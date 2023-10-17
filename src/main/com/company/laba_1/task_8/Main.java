package main.com.company.laba_1.task_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] {
                1, 3, 5, 7, 9
        };
        int[] arr2 = new int[] {
                0, 2, 3, 6, 8, 9
        };
        System.out.println(getIndexesToInsertElements(arr1, arr2));
    }

    public static List<Integer> getIndexesToInsertElements(int[] destArr, int[] srcArr) {
        List<Integer> indexes = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < srcArr.length; i++) {
            while (j < destArr.length && srcArr[i] > destArr[j]) {
                j++;
            }
            if (j == destArr.length) {
                while (i < srcArr.length){
                    indexes.add(j + indexes.size());
                    i++;
                }
                break;
            }
            indexes.add(j + indexes.size());
        }
        return indexes;
    }
}
