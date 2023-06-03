package homeworkseven;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double numberFirst = scanner.nextDouble();
        System.out.println("Ведите второе число: ");
        double numberSecond = scanner.nextDouble();
        double maximum = (numberFirst >= numberSecond) ? numberFirst : numberSecond;
        System.out.println("Наибольшее чсло: " + maximum);
    }
}
