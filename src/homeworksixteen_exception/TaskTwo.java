package homeworksixteen_exception;

import java.util.Scanner;

public class TaskTwo {

    public static void abstractMethod(double number) throws NegativeNumberExcetion {
        if (number < 0) {
            throw new NegativeNumberExcetion("Пользователь ввел отрицательое число");
        }
        if (number > 100) {
            throw new UncheckedException("Пользователь ввел число больше 100");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите  произвольное число");
        var randomNumber = new Scanner(System.in).nextDouble();
        try {
            abstractMethod(randomNumber);
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            System.out.println("Исключение обработано");
        } finally {
            System.out.println("После обработки исключения - блок finally");
        }
    }
}
