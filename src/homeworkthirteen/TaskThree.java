package homeworkthirteen;

public class TaskThree {

    private static final int ROWS = 4;
    private static final int COLUMNS = ROWS;

    private static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateSumMatrixDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix[i].length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix(ROWS, COLUMNS);
        printMatrix(matrix);
        System.out.println("\nCумма элементов побочной диагонали матрицы: " + calculateSumMatrixDiagonal(matrix));

    }
}
