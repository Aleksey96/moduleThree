package homeworkten;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFour {

    private static int[] initializeArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            int powerOfTwo = 1;
            for (int j = 1; j <= i + 1; j++) {
                powerOfTwo *= 2;
            }
            array[i] = powerOfTwo;
        }
        return array;
    }


    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("¬ведите степень двойки до которой нужно вывести рузльтат: ");
        int size = scanner.nextInt();
        int[] array = initializeArray(size);
        System.out.println(Arrays.toString(array));
    }
}
