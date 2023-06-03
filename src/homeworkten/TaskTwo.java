package homeworkten;

public class TaskTwo {

    private final static int SIZE_ARRAY = 8;

    private static int[] initializeArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 9);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private static double calculateAverageElementsArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = initializeArray(SIZE_ARRAY);
        System.out.println("\nСреднее арифметическое массива: " + calculateAverageElementsArray(array));
    }
}
