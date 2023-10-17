package main.com.company.laba_1.task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFormula(1, 3));
    }

    public static double calculateFormula(double x, double y) {
        return ((1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y))))) + x;
    }
}