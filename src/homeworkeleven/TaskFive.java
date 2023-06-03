package homeworkeleven;

import java.util.Arrays;

public class TaskFive {

    private final static String STRING = "Ўумоизол€ци€";

    private static void calculateRepeatedCharacters(String value) {
        int count = 0;
        // перевожу все символы в нижний регистр
        char[] array = value.toLowerCase().toCharArray();
        char[] bufferArray = new char[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !containedElementInArray(array[i], i, bufferArray)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(" оличество повтор€ющхс€ символов в строке: " + count);
    }

    private static boolean containedElementInArray(char symbol, int index, char[] buffer) {
        boolean check = false;
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == symbol) {
                check = true;
                break;
            }
        }
        if (check == false) {
            buffer[index] = symbol;
        }
        return check;
    }

    public static void main(String[] args) {
        calculateRepeatedCharacters(STRING);
    }
}
