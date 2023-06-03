package homeworktwelve;

public class TaskThree {

    private final static int ROWS = 5;

    private static int[][] createMatrix(int rows) {
        return new int[rows][rows];
    }

    private static void fillArray(int[][] matrix, int rows) {
        for (int i = rows - 1, k = 0; i >= 0; i--, k++) {
            for (int j = k; j < rows - k; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix(ROWS);
        fillArray(matrix, ROWS);
        printMatrix(matrix);
    }
}
