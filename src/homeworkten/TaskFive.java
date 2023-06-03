package homeworkten;

public class TaskFive {

    private final static int SIZE_ARRAY = 10;

    private static int[] initializeArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 1000);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private static int findMinimum(int[] array) {
        int minimum = array[0];
        for (int element : array) {
            if (element <= minimum)
                minimum = element;
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] array = initializeArray(SIZE_ARRAY);
        System.out.println("\nМинимальный элемент в массиве: " + findMinimum(array));
    }

}
