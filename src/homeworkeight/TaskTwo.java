package homeworkeight;

public class TaskTwo {
    public static void main(String[] args) {
        int number = 34;

        switch (number % 2) {
            case 0: {
                if (number > 0 && number != 0) {
                    System.out.println(number + " - ������������� ������ �����");
                } else if (number < 0 && number != 0) {
                    System.out.println(number + " - ������������� ������ �����");
                } else {
                    System.out.println("������� �����");
                }
                break;
            }
            case 1: {
                System.out.println(number + " - ������������� �������� �����");
                break;
            }
            case -1: {
                System.out.println(number + " - ������������� �������� �����");
            }
        }
    }
}
