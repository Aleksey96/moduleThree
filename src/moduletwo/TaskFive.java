package moduletwo;

public class TaskFive {
    public static void main(String[] args) {
        long number = 87;
        long units;
        long tens;
        units = number % 10;
        tens = number / 10;
        System.out.println("�����, ���������� ��� ������������ ���� ��������� ����� " + number + " : " + (units * 10 + tens));
    }
}
