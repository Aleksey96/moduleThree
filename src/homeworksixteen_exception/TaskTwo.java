package homeworksixteen_exception;

import java.util.Scanner;

public class TaskTwo {

    public static void abstractMethod(double number) throws NegativeNumberExcetion {
        if (number < 0) {
            throw new NegativeNumberExcetion("������������ ���� ������������ �����");
        }
        if (number > 100) {
            throw new UncheckedException("������������ ���� ����� ������ 100");
        }
    }

    public static void main(String[] args) {
        System.out.println("�������  ������������ �����");
        var randomNumber = new Scanner(System.in).nextDouble();
        try {
            abstractMethod(randomNumber);
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            System.out.println("���������� ����������");
        } finally {
            System.out.println("����� ��������� ���������� - ���� finally");
        }
    }
}
