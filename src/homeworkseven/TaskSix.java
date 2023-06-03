package homeworkseven;

import java.util.Scanner;

import static java.lang.Double.*;

public class TaskSix {
    public static void main(String[] args) {
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите числом номер операци, где\n" +
                "1 Ч сложение,\n2 Ч вычитание,\n3 Ч умножение,\n4 Ч деление.");
        int operation = scanner.nextInt();
        System.out.println("¬ведите первое число дл€ операции: ");
        double firstOperand = scanner.nextDouble();
        System.out.println("¬ведите второе число дл€ операции: ");
        double secondOperand = scanner.nextDouble();
        if (operation >= 1 && operation <= 4) {
            if (operation == 1) {
                result = firstOperand + secondOperand;
            } else if (operation == 2) {
                result = firstOperand - secondOperand;
            } else if (operation == 3) {
                result = firstOperand * secondOperand;
            } else if (operation == 4 && secondOperand != 0) {
                result = firstOperand / secondOperand;
            } else if (firstOperand > 0) {
                result = POSITIVE_INFINITY;
            } else if (firstOperand < 0) {
                result = NEGATIVE_INFINITY;
            } else {
                result = NaN;
            }
            System.out.println("–езультат операциии " + operation + " равен " + result);
        } else {
            System.out.println("”казанна€ операци€ не предусмотрена в этой программе. " +
                    "¬ведите еще раз операцию числом от 1 до 4.");
        }
    }
}
