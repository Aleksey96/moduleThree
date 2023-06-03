package homeworkseven;

import java.util.Scanner;

import static java.lang.Double.*;

public class TaskSix {
    public static void main(String[] args) {
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ����� �������, ���\n" +
                "1 � ��������,\n2 � ���������,\n3 � ���������,\n4 � �������.");
        int operation = scanner.nextInt();
        System.out.println("������� ������ ����� ��� ��������: ");
        double firstOperand = scanner.nextDouble();
        System.out.println("������� ������ ����� ��� ��������: ");
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
            System.out.println("��������� ��������� " + operation + " ����� " + result);
        } else {
            System.out.println("��������� �������� �� ������������� � ���� ���������. " +
                    "������� ��� ��� �������� ������ �� 1 �� 4.");
        }
    }
}
