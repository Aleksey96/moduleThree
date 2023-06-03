package ComplexControlWork;

import java.util.Scanner;

public class TaskTwo {

    private static void calculateSumSquares(int numberA, int numberB) {
        for (int i = numberA; i <= numberB; i++) {
            for (int j = i; j <= numberB; j++) {
                System.out.println(i + "^2 + " + j + "^2 = " + (i * i + j * j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("¬ведите первое число: ");
        int numberA = scanner.nextInt();
        System.out.print("¬ведите второе число: ");
        int numberB = scanner.nextInt();
        calculateSumSquares(numberA, numberB);
    }
}
