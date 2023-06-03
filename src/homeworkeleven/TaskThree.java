package homeworkeleven;

public class TaskThree {

    private final static String STRING = "Занятие";

    private static void printReverseCharArray(String string) {
        char[] array = string.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        printReverseCharArray(STRING);

    }

}
