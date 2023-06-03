package homeworktwelve;

import java.util.Arrays;

public class TaskTwo {

    /*
    В условиях задачи не уточняется как искать средний элемент.
    Я пошел по лекгому пути, создав одномерный массив из элементов
    матрицы. Этот алгоритм проще, но использует доп. ресурсы.
    Если идти другим путем, алгоритм будет в разы сложнее.
     */

    private static final int ROWS = 3;
    private final static int COLUMNS = 5;

    private static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20 + 1);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void sortBubbleMatrix(int[][] matrix) {
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length; l++) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[k][l] < matrix[i][j]) {
                            int temp = matrix[k][l];
                            matrix[k][l] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
                }
            }
        }
    }

    private static int[] createArray(int[][] matrix, int rows, int columns) {
        int[] array = new int[rows * columns];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[k] = matrix[i][j];
                k++;
            }
        }
        System.out.println("\n" + Arrays.toString(array));
        return array;
    }

    private static void findMiddleElement(int[] array) {
        int median = 0;
        if (array.length % 2 != 0) {
            int indexMiddleElement = array.length / 2;
            median = array[indexMiddleElement];
        } else {
            int indexMedian1 = array.length / 2 - 1;
            int indexMedian2 = indexMedian1 + 1;
            median = (array[indexMedian1] + array[indexMedian2]) / 2;
        }
        System.out.println("Средний элемент: " + median);
    }

    public static void main(String[] args) {
        System.out.println("Созданный массив: ");
        int[][] matrix = createMatrix(ROWS, COLUMNS);
        printMatrix(matrix);
        sortBubbleMatrix(matrix);
        System.out.println("Отсортированный массив: ");
        printMatrix(matrix);
        int[] array = createArray(matrix, ROWS, COLUMNS);
        findMiddleElement(array);

    }
}
