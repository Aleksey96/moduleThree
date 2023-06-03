package homeworknine;

import java.util.Scanner;

public class TaskOne {

    private static long factorialCalculated(long value) {
        long factorial = 1;
        while (value > 0) {
            if (value == 0) {
                break;
            } else {
                factorial *= value;
                value--;
            }
        }
        return factorial;
    }

    private static long factorialCalculatedSecond(long value) {
        long factorial = 1;
        do {
            if (value == 0) {
                break;
            } else {
                factorial *= value;
                value--;
            }
        } while (value > 0);
        return factorial;
    }

    private static long factorialCalculatedThird(long value) {
        long factorial = 1;
        if (value == 0) {
            return factorial;
        } else {
            for (int i = 1; i <= value; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    private static long factorialCalculatedFourth(long value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * factorialCalculatedFourth(value - 1);
    }

    public static void main(String[] args) {
        long value;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("������� ����� ��������������� ����� �� ������ 20, �.�. ��������� ����� 21 ��������� �������� �������� long: ");
            value = scanner.nextLong();
        } while ((value < 0 ^ value >= 21));
        System.out.print("������ ������(while): ");
        System.out.print(value + "! = " + factorialCalculated(value) + "\n");
        System.out.print("������ ������(do-while): ");
        System.out.print(value + "! = " + factorialCalculatedSecond(value) + "\n");
        System.out.print("������ ������(for): ");
        System.out.print(value + "! = " + factorialCalculatedThird(value) + "\n");
        System.out.print("��������� ������(��������): ");
        System.out.print(value + "! = " + factorialCalculatedFourth(value) + "\n");
    }
}
