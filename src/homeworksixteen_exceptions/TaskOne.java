package homeworksixteen_exceptions;

import java.util.Scanner;

public class TaskOne {
    private static final int SIZE_ARRAY = 10;

    private static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        return array;
    }

    private static void printResultDiv(int[] array) {
        int randomNumber = 0;
        try {
            System.out.println("¬ведите произвольное целое число");
            randomNumber = new Scanner(System.in).nextInt();
            for (int element : array) {
                System.out.println(randomNumber /element);
            }
        } catch (ArithmeticException ex) {
            System.out.println(randomNumber+" "+ex.getMessage());
        } finally {
            System.out.println("Block finally");
        }
    }

    public static void main(String[] args) {
        printResultDiv(createArray(SIZE_ARRAY));
    }
}
