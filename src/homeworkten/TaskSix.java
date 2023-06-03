package homeworkten;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {

    private static int[] createArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-50 + Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private static void increaseByOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i]++;
            }
        }
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("¬ведите количество элементов в массиве: ");
        int sizeArray = scanner.nextInt();
        int[] array = createArray(sizeArray);
        increaseByOne(array);
        System.out.println("\n" + Arrays.toString(array));


    }
}
