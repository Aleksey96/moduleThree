package ComplexControlWork;

import java.util.Scanner;

public class TaskFour {

    private static void checkSimpleNumbers() {
        System.out.println("Введите целое положительное число после двоеточия: ");
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int countDividers = 2;

        //искючаем все четные числа
        if (number % 2 == 0) {
            if (number != 2) {
                System.out.println("Число не является простым");
                return;
            } else {
                System.out.println("Число 2 является простым");
                return;
            }
        }

        for (int i = 3; i < number; i = i + 2) {
            if (number % i == 0) {
                countDividers++;
                if (countDividers > 2) {
                    System.out.println("Число не является простым");
                    return;
                }
            }
        }
        System.out.println("Число является простым.");
    }

    public static void main(String[] args) {
        checkSimpleNumbers();
    }
}
