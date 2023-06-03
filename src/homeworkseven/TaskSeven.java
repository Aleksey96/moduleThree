package homeworkseven;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        String resultString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числом номер месяца в году: ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5) {
                resultString = "Весна: ";
                if (month == 3) {
                    System.out.println(resultString + "Март");
                } else if (month == 4) {
                    System.out.println(resultString + "Апрель");
                } else if (month == 5) {
                    System.out.println(resultString + "Май");
                }
            } else if (month >= 6 && month <= 8) {
                resultString = "Лето: ";
                if (month == 6) {
                    System.out.println(resultString + "Июнь");
                } else if (month == 7) {
                    System.out.println(resultString + "Июль");
                } else if (month == 8) {
                    System.out.println(resultString + "Август");
                }
            } else if (month >= 9 && month <= 11) {
                resultString = "Осень: ";
                if (month == 9) {
                    System.out.println(resultString + "Сентябрь");
                } else if (month == 10) {
                    System.out.println(resultString + "Октябрь");
                } else if (month == 11) {
                    System.out.println(resultString + "Ноябрь");
                }
            } else {
                resultString = "Зима: ";
                if (month == 12) {
                    System.out.println(resultString + "Декабрь");
                } else if (month == 1) {
                    System.out.println(resultString + "Январь");
                } else if (month == 2) {
                    System.out.println(resultString + "Февраль");
                }
            }
        } else {
            System.out.println("Такого месяца не существует,попробуйте еще раз запустить программу");
        }
    }
}
