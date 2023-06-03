package ComplexControlWork;

import java.util.Scanner;

public class TaskFive {

    private final static int COUNT_ATTEMPTS = 3;

    private static void askedRiddle() {
        System.out.println("� ��� ���� ��� ������� �� ����������� �������." + "\n" +
                "����� ���� ������� ��������� ����� ���������." + "\n" +
                "���� � ������ ����� ��������������� ������, ����� ����� �������� ������������." + "\n" +
                "�� ������ ��������, ���� �� ������ �������� �������, ������� ����� \"������\" ��� \"������\"." + "\n" +
                "�������: ��� ��� �����: �����, �������, � ����� � ��������� ����� �������?" + "\n" +
                "������� ����� � ������ ����� ������.");
        String answer;
        var scanner = new Scanner(System.in);
        for (int i = 1; i <= COUNT_ATTEMPTS; i++) {
            answer = scanner.nextLine();
            switch (answer) {
                default: {
                    System.out.println("������� ���.");
                    break;
                }
                case "����������":
                case "����������": {
                    System.out.println("���������!");
                    System.out.println("��������� ���������.");
                    return;
                }
                case "������":
                case "������": {
                    System.out.println("���������� �����: ����������.");
                    System.out.println("��������� ���������.");
                    return;
                }
            }
        }
        System.out.println("��������� ���������.");
    }

    public static void main(String[] args) {
        askedRiddle();
    }
}
