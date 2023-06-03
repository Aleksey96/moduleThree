package ComplexControlWork;

import java.util.Scanner;

public class TaskFour {

    private static void checkSimpleNumbers() {
        System.out.println("������� ����� ������������� ����� ����� ���������: ");
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int countDividers = 2;

        //�������� ��� ������ �����
        if (number % 2 == 0) {
            if (number != 2) {
                System.out.println("����� �� �������� �������");
                return;
            } else {
                System.out.println("����� 2 �������� �������");
                return;
            }
        }

        for (int i = 3; i < number; i = i + 2) {
            if (number % i == 0) {
                countDividers++;
                if (countDividers > 2) {
                    System.out.println("����� �� �������� �������");
                    return;
                }
            }
        }
        System.out.println("����� �������� �������.");
    }

    public static void main(String[] args) {
        checkSimpleNumbers();
    }
}
