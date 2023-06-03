package homeworkeleven;

import java.util.Arrays;

public class TaskOne {

    private final static String STRING = "Занятие";

    private static void printCharArray(String string) {
        char[] array = string.toCharArray();
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        printCharArray(STRING);


    }
}
