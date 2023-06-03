package homeworkeleven;

public class TaskFour {

    private final static String STRING = "java323group";

    private static void calculateDigitsInString(String value) {
        int count = 0;
        char[] array = value.toCharArray();
        for (char element : array) {
            if (element == '0' || element == '1' || element == '2' ||
                    element == '3' || element == '4' || element == '5' ||
                    element == '6' || element == '7' || element == '8' || element == '9') {
                count++;
            }
        }
        System.out.print("Количество цифр в строке: " + count);
    }

    /*
     * Хотел понять как isDigits() работает - не понял
     */
    private static void calculateDigitsInStringWithMethodIsDigits(String value) {
        int count = 0;
        char[] array = value.toCharArray();
        for (char element : array) {
            if (Character.isDigit(element)) {
                count++;
            }
        }
        System.out.print("\nКоличество цифр в строке: " + count);
    }

    public static void main(String[] args) {
        calculateDigitsInString(STRING);
        calculateDigitsInStringWithMethodIsDigits(STRING);
    }
}
