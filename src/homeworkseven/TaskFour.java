package homeworkseven;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ����� ���� �� 1 �� 7: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println(number + " - �����������");
            } else if (number == 2) {
                System.out.println(number + " - ��������");
            } else if (number == 3) {
                System.out.println(number + " - �����");
            } else if (number == 4) {
                System.out.println(number + " - �������");
            } else if (number == 5) {
                System.out.println(number + " - �������");
            } else if (number == 6) {
                System.out.println(number + " - �������");
            } else if (number == 7) {
                System.out.println(number + " - �����������");
            }
        } else {
            System.out.println("�������� ����� �� ������ � �������� �� 1 �� 7.");
        }
    }
}
