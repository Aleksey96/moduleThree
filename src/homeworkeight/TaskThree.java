package homeworkeight;

/* ��������� {} � ������ case, ������ ��� ������ ��������� ������,
 *   ��� ������ case ���������� � �������������
 *   � �� ����� ���������� �������
 * */

public class TaskThree {
    public static void main(String[] args) {
        int number = 17;
        switch (number / 10) {
            default: {
                System.out.println("�������� �� ������ � �������� �� 10 �� 40");
                break;
            }
            case 1:
            case 4: {
                System.out.println(number + " ������� �������");
                break;
            }
            case 2:
            case 3: {
                switch (number % 10) {
                    case 0: {
                        System.out.println(number + " ������� �������");
                        break;
                    }
                    case 2:
                    case 3:
                    case 4: {
                        System.out.println(number + " ������� �������");
                        break;
                    }
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        System.out.println(number + " ������� �������");
                    }
                }
                break;
            }
        }
    }
}
