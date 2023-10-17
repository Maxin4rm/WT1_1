package main.com.company.laba_1.task_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPointInArea(4, 5));
    }

    public static boolean isPointInArea(double x, double y) {
        return ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)) || ((x >= -6 && x <= 6) && (y >= -3 && y <= 0));
    }
}
