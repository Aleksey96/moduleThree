package ComplexControlWork;

import java.util.Scanner;

public class TaskThree {

    private static void printNumbers(int numberA, int numberB) {
        for (int i = numberA; i <= numberB; i++) {
            for (int j = 1; j <= i - numberA + 1; j++) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int numberA = scanner.nextInt();
        System.out.print("������� ������ �����: ");
        int numberB = scanner.nextInt();
        printNumbers(numberA, numberB);
    }
}
