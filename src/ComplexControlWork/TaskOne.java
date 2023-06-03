package ComplexControlWork;

import java.util.Scanner;

public class TaskOne {

    private static void calculateSumSequence(int lastElementSequence) {
        double sumSequence = 0;
        for (int i = 1; i <= lastElementSequence; i++) {
            sumSequence += 1.0 / i;
        }
        System.out.println("Сумма последовательности из " + lastElementSequence + " членов: "
                + String.format("%.3f", sumSequence));
    }

    private static double calculateSumSequenceRecursion(int lastElementSequence, double sumSequence) {
        if (lastElementSequence == 0) {
            return sumSequence;
        } else {
            sumSequence += 1.0 / lastElementSequence;
            lastElementSequence -= 1;
            return calculateSumSequenceRecursion(lastElementSequence, sumSequence);
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        var scanner = new Scanner(System.in);
        var lastElementSequence = scanner.nextInt();
        calculateSumSequence(lastElementSequence);
        System.out.println("Сумма последовательности из " + lastElementSequence + " членов: "
                + String.format("%.3f", calculateSumSequenceRecursion(lastElementSequence, 0)));
    }
}
