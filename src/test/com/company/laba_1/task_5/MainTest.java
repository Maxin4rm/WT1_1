package test.com.company.laba_1.task_5;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_5.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @org.junit.jupiter.api.Test
    void givenArray_whenMinElementsAmountToRemove_thenReturnMinElementsToRemove() {
        int[] array = new int[] { 1, 4, 2, 6, 3, 5, 11, 10, 15};
        int expected = 3;
        int actual = Main.minElementsAmountToRemove(array);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void givenAscendingSequence_whenMinElementsAmountToRemove_thenReturnZero() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8};
        int expected = 0;
        int actual = Main.minElementsAmountToRemove(array);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void givenDescendingSequence_whenMinElementsAmountToRemove_thenReturnLengthMinusOne() {
        int[] array = new int[] { 7, 6, 5, 4, 3, 2, 1};
        int expected = 6;
        int actual = Main.minElementsAmountToRemove(array);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void givenOneElementArray_whenMinElementsNumberToRemove_thenReturnZero() {
        int[] array = new int[] { 666 };
        int expected = 0;
        int actual = Main.minElementsAmountToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void givenEmptyArray_whenMinElementsNumberToRemove_thenReturnZero() {
        int[] array = new int[0];
        int expected = 0;
        int actual = Main.minElementsAmountToRemove(array);
        assertEquals(expected, actual);
    }
}