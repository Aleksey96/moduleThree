package homeworkeight;

import java.util.Scanner;

/* ��������� {} � ������ case, ������ ��� ������ ��������� ������,
 *   ��� ������ case ���������� � �������������
 *   � �� ����� ���������� �������
 * */

public class TaskOne {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("�������� ������� ��������� ������ �� 1 �� 4, ��� \n1 - ������," +
                "\n2 - ��������,\n3 - ����� ����������," + "\n4 - ������� ����������.");
        var elementCircle = scanner.nextInt();
        System.out.println("������� �������� �������� ����������: ");
        var volumeElementCircle = scanner.nextDouble();

        /* ��������� ������� �� ������� �� 10 ��� ����, ����� �� ����������� if ��� ��������,
         * ��� ��������� �������� ������� � �������� �� 1 �� 4.
         *
         * � ������ ������� ��������� ������������ ������ ������ ��������  �� ����� �������� �������� ����������,
         * ���� ��� �� if, �� ��� ����� "��������� ��������" ����� ������� �� ������������ �� ����.
         */

        switch (elementCircle % 10) {
            default: {
                System.out.println("��������� �������� �� ������ � �������� �� 1 �� 4");
                break;
            }
            case 1: {
                System.out.println("������ ���������� �����: " + volumeElementCircle + ",\n" +
                        "�������� ���������� �����: " + (2 * volumeElementCircle) + ",\n" +
                        "����� ���������� �����: " + (2 * PI * volumeElementCircle) + ",\n" +
                        "������� ���������� �����: " + (PI * volumeElementCircle * volumeElementCircle));
                break;
            }
            case 2: {
                System.out.println("������ ���������� �����: " + (volumeElementCircle / 2) + ",\n" +
                        "�������� ���������� �����: " + volumeElementCircle + ",\n" +
                        "����� ���������� �����: " + (PI * volumeElementCircle) + ",\n" +
                        "������� ���������� �����: " + (PI * volumeElementCircle * volumeElementCircle / 4));
                break;
            }
            case 3: {
                System.out.println("������ ���������� �����: " + (volumeElementCircle / (2 * PI)) + ",\n" +
                        "�������� ���������� �����: " + (volumeElementCircle / PI) + ",\n" +
                        "����� ���������� �����: " + volumeElementCircle + ",\n" +
                        "������� ���������� �����: " + (volumeElementCircle * volumeElementCircle / (4 * PI)));
                break;
            }
            case 4: {
                System.out.println("������ ���������� �����: " + (Math.sqrt(volumeElementCircle / PI)) + ",\n" +
                        "�������� ���������� �����: " + (2 * Math.sqrt(volumeElementCircle / PI)) + ",\n" +
                        "����� ���������� �����: " + (2 * Math.sqrt(volumeElementCircle * PI)) + ",\n" +
                        "������� ���������� �����: " + volumeElementCircle);
            }
        }
    }
}
