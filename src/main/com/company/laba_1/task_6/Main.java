package main.com.company.laba_1.task_6;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {
                1, 2, 3, 4, 5
        };
        System.out.println(createTable(makeMatrix(numbers)));
    }

    public static String createTable(int[][] matrix) {
        StringBuilder table = new StringBuilder();
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                table.append(ints[j]).append(" ");
            }
            table.append("\n");
        }
        return table.toString();
    }

    public static int[][] makeMatrix(int[] numbers) {

        int[][] matrix = new int[numbers.length][numbers.length];
        if(numbers.length == 0){
            return matrix;
        }
        matrix[0] = numbers;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                matrix[i][j] = matrix[i - 1][(j + 1) % numbers.length];
            }
        }
        return matrix;
    }
}
