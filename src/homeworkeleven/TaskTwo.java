package homeworkeleven;

import java.util.Scanner;

public class TaskTwo {

    /*
     * Данную задачу можно решить двумя способовами с помощью самописных
     * методов проверки и с помощью регулярных выражений.
     *
     * В условие ззаданния были определенны критерии для проверки,
     * но если пользователь будет использовать такие номера телефона:
     * +7 (922) 456-23-21, +7 922 456 23 21, то с точки срения пользователя
     * таке номера телеона будут правильными, но не с точки срения программы.
     * */

    private static boolean checkLengthNumber(String number) {
        char[] arrayChars = new char[number.length() - 2];
        return (number.length() == 12 && arrayChars.length == 10);
    }

    private static boolean checkBeginNumber(String number) {
        return number.startsWith("+7");
    }

    private static boolean containedDigits(String number) {
        char[] array = new char[number.length() - 2];
        number.getChars(2, number.length(), array, 0);
        for (char element : array) {
            if (element == '0' || element == '1' || element == '2' || element == '3' ||
                    element == '4' || element == '5' || element == '6' || element == '7' ||
                    element == '8' || element == '9') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean getResult(String number) {
        return (containedDigits(number) && checkBeginNumber(number) && checkLengthNumber(number));
    }


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Введите номер сотового телефона: ");
        var numberTelephone = scanner.nextLine();
        System.out.println(getResult(numberTelephone));
        System.out.print(numberTelephone.matches("(\\+7)\\d{10}"));
    }
}
