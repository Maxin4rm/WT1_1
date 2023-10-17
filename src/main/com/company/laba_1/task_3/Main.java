package main.com.company.laba_1.task_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(createTable(tangentValuesOnInterval(-1, 1, 0.3)));
    }

    public static double[][] tangentValuesOnInterval(double a, double b, double h) {

        double[][] pairOfValues = new double[(int)((b - a) / h) + 1][2];

        int i = 0;
        for (double x = a; x <= b; x += h) {
            pairOfValues[i][0] = x;
            pairOfValues[i][1] = Math.tan(x);
            i++;
        }
        return pairOfValues;
    }

    public static String createTable(double[][] pairOfValues) {
        StringBuilder table = new StringBuilder("|    x     |   tg(x)  |\n|----------|----------|\n");
        for (double[] pair : pairOfValues) {
            if (pair[0] >= 0.0) {
                table.append(String.format("| %.5f  | %.5f  |\n", pair[0], pair[1]));
            }
            else
            {
                table.append(String.format("| %.5f | %.5f |\n", pair[0], pair[1]));
            }
        }
        return table.toString();
    }
}
