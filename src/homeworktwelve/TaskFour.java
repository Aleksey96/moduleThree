package homeworktwelve;

public class TaskFour {

    private static int getSizeArray() {
        return (int) (Math.random() * 10 + 20);
    }

    private static int[] createArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 9);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static void sortBubbleArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static boolean containedInArray(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    private static void printSecondMaximumNumber(int[] array) {
        int[] uniqueNumbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (!containedInArray(array[i], uniqueNumbers)) {
                uniqueNumbers[i] = array[i];
            }
        }
        sortBubbleArray(uniqueNumbers);
        System.out.println();
        printArray(uniqueNumbers);
        System.out.println("\nВторой максимальный элемент в наборе: " + uniqueNumbers[uniqueNumbers.length - 2] + "\n");
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int sizeArray = getSizeArray();
        int[] array = createArray(sizeArray);
        sortBubbleArray(array);
        printArray(array);
        printSecondMaximumNumber(array);


    }
}
