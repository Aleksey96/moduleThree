package homeworktwelve;

import java.util.Arrays;

public class TaskOne {

    private final static int SIZE = 3;

    private static int[][] createMatrix(int size) {
        int[][] matrix = new int[SIZE][SIZE];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        return matrix;
    }

    private static void findMinimumElementMatrix(int[][] matrix) {
        int minimum = matrix[0][0];
        for (int[] array : matrix) {
            for (int element : array) {
                if (element < minimum) {
                    minimum = element;
                }
            }
        }
        System.out.println("Минимальный элемент матрицы " + Arrays.deepToString(matrix) + " : " + minimum);
    }


    public static void main(String[] args) {
        findMinimumElementMatrix(createMatrix(SIZE));
    }
}
