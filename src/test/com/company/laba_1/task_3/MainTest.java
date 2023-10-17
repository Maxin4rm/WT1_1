package test.com.company.laba_1.task_3;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_3.Main;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void givenIntervalAndStep_whenTangentValuesOnInterval_thenReturnArrayContainsArgumentAndFunctionValues() {
        double a = -3;
        double b = 4;
        double h = 2;
        double[][] expected = new double[][] {
                { -3, Math.tan(-3) },
                { -1, Math.tan(-1) },
                { 1, Math.tan(1) },
                { 3, Math.tan(3) },
        };
        double[][] actual = Main.tangentValuesOnInterval(a, b, h);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void givenIntervalAndStepGreaterThanInterval_whenTangentValuesOnInterval_thenReturnArrayOfLengthOne() {
        double a = -5;
        double b = 0;
        double h = 10;
        double[][] expected = new double[][] {
                { -5, Math.tan(-5) },
        };
        double[][] actual = Main.tangentValuesOnInterval(a, b, h);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void givenIntervalOfLengthZero_whenTangentValuesOnInterval_thenReturnArrayOfLengthOne() {
        double a = 2;
        double b = 2;
        double h = 1;
        double[][] expected = new double[][] {
                { 2, Math.tan(2) },
        };
        double[][] actual = Main.tangentValuesOnInterval(a, b, h);
        assertTrue(Arrays.deepEquals(actual, expected));
    }
}