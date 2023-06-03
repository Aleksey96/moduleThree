package ComplexControlWork;

import java.util.Scanner;

public class TaskFive {

    private final static int COUNT_ATTEMPTS = 3;

    private static void askedRiddle() {
        System.out.println("У вас есть три попытки на отгадывание загадки." + "\n" +
                "После трех ответов программа будет завершена." + "\n" +
                "Если в ответе будут орфографические ошибки, ответ будет считатся неправильным." + "\n" +
                "Вы можете сдасться, если не можете отгадать загадку, написав слово \"Сдаюсь\" или \"сдаюсь\"." + "\n" +
                "Загадка: Что это такое: синий, большой, с усами и полностью набит зайцами?" + "\n" +
                "Введите ответ с начала новой строки.");
        String answer;
        var scanner = new Scanner(System.in);
        for (int i = 1; i <= COUNT_ATTEMPTS; i++) {
            answer = scanner.nextLine();
            switch (answer) {
                default: {
                    System.out.println("Подумай еще.");
                    break;
                }
                case "Троллейбус":
                case "троллейбус": {
                    System.out.println("Правильно!");
                    System.out.println("Программа завершена.");
                    return;
                }
                case "сдаюсь":
                case "Сдаюсь": {
                    System.out.println("Правильный ответ: троллейбус.");
                    System.out.println("Программа завершена.");
                    return;
                }
            }
        }
        System.out.println("Программа завершена.");
    }

    public static void main(String[] args) {
        askedRiddle();
    }
}
