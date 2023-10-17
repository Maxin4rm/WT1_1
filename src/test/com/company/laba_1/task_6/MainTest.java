package test.com.company.laba_1.task_6;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_6.Main;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void givenArrayOfNumbers_whenMakeMatrix_thenReturnMatrixWithShiftedElements() {
        int[] array = new int[] {
                5, 4, 3, 2, 1
        };
        int[][] expected = new int[][] {
                { 5, 4, 3, 2, 1 },
                { 4, 3, 2, 1, 5 },
                { 3, 2, 1, 5, 4 },
                { 2, 1, 5, 4, 3 },
                { 1, 5, 4, 3, 2 }
        };
        int[][] actual = Main.makeMatrix(array);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void givenSameNumbers_whenMakeMatrix_thenReturnMatrixWithSameNumbers() {
        int[] array = new int[] {
                3, 3, 3, 3, 3, 3
        };
        int[][] expected = new int[][] {
                { 3, 3, 3, 3, 3, 3 },
                { 3, 3, 3, 3, 3, 3 },
                { 3, 3, 3, 3, 3, 3 },
                { 3, 3, 3, 3, 3, 3 },
                { 3, 3, 3, 3, 3, 3 },
                { 3, 3, 3, 3, 3, 3 }
        };
        int[][] actual = Main.makeMatrix(array);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void givenEmptyArray_whenMakeMatrix_thenReturnEmptyMatrix() {
        int[] array = new int[0];
        int[][] expected = new int[0][0];
        int[][] actual = Main.makeMatrix(array);
        assertTrue(Arrays.deepEquals(actual, expected));
    }
}