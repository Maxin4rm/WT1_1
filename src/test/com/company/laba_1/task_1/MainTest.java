package test.com.company.laba_1.task_1;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_1.Main;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void givenValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = -1, y = 1;
        double expected = -0.5;
        double actual = Main.calculateFormula(x, y);
        double delta = 0.0;
        assertEquals(expected, actual, delta);
    }

    @Test
    void givenPositiveValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = 1, y = 3;
        double expected = 1.561696434608681;
        double actual = Main.calculateFormula(x, y);
        double delta = 0.0;
        assertEquals(expected, actual, delta);
    }

    @Test
    void givenNegativeValues_whenCalculateFormula_thenReturnCalculatedValue() {
        double x = -1, y = -2;
        double expected = -0.6077250551250704;
        double actual = Main.calculateFormula(x, y);
        double delta = 0.0;
        assertEquals(expected, actual, delta);
    }
}