package homeworkten;

import java.util.Scanner;

public class TaskThree {

    private static int[] initializeArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 9);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static void printEvenNumbers(int[] array) {
        int countEvenNumbers = 0;
        System.out.print("������ �����: ");
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
                countEvenNumbers++;
            }
        }
        System.out.println("\n���������� ������ ����� � ��������: " + countEvenNumbers);
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("������� ���������� ��������� �������: ");
        int size = scanner.nextInt();
        int[] array = initializeArray(size);
        printEvenNumbers(array);


    }
}
