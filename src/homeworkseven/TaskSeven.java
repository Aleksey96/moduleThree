package homeworkseven;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        String resultString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ����� ������ � ����: ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5) {
                resultString = "�����: ";
                if (month == 3) {
                    System.out.println(resultString + "����");
                } else if (month == 4) {
                    System.out.println(resultString + "������");
                } else if (month == 5) {
                    System.out.println(resultString + "���");
                }
            } else if (month >= 6 && month <= 8) {
                resultString = "����: ";
                if (month == 6) {
                    System.out.println(resultString + "����");
                } else if (month == 7) {
                    System.out.println(resultString + "����");
                } else if (month == 8) {
                    System.out.println(resultString + "������");
                }
            } else if (month >= 9 && month <= 11) {
                resultString = "�����: ";
                if (month == 9) {
                    System.out.println(resultString + "��������");
                } else if (month == 10) {
                    System.out.println(resultString + "�������");
                } else if (month == 11) {
                    System.out.println(resultString + "������");
                }
            } else {
                resultString = "����: ";
                if (month == 12) {
                    System.out.println(resultString + "�������");
                } else if (month == 1) {
                    System.out.println(resultString + "������");
                } else if (month == 2) {
                    System.out.println(resultString + "�������");
                }
            }
        } else {
            System.out.println("������ ������ �� ����������,���������� ��� ��� ��������� ���������");
        }
    }
}
