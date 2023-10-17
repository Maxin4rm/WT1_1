package test.com.company.laba_1.task_4;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_4.Main;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    void givenArrayWithPrimeNumbers_whenGetPrimeNumbersIndexes_thenReturnIndexes() {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        };
        List<Integer> expected = List.of(1, 2, 4, 6, 10, 12);
        List<Integer> actual = Main.getPrimeNumbersIndexes(array);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenArrayWithoutPrimeNumbers_whenGetPrimeNumbersIndexes_thenReturnEmptyList() {
        int[] array = new int[] {
                4, 6, 8, 10, 12, 14, 16
        };
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Main.getPrimeNumbersIndexes(array);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenAllPrimeNumbers_whenGetPrimeNumbersIndexes_thenReturnAllIndexes() {
        int[] array = new int[] {
                2, 3, 5, 7, 11, 13, 17, 19, 23
        };
        List<Integer> expected = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> actual = Main.getPrimeNumbersIndexes(array);
        assertIterableEquals(expected, actual);
    }

    @Test
    void givenEmptyArray_whenGetPrimeNumbersIndexes_thenReturnEmptyList() {
        int[] array = new int[0];
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Main.getPrimeNumbersIndexes(array);
        assertIterableEquals(expected, actual);
    }
}