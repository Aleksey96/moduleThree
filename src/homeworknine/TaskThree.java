package homeworknine;

import java.util.Scanner;

public class TaskThree {

    private static void iterateRange(int leftBorder, int rightBorder) {
        int begin = leftBorder;
        while (begin <= rightBorder) {
            System.out.print(begin + " ");
            begin++;
        }
        System.out.println("\n" + " оличество целых чисел в дапозоне от " + leftBorder +
                " до " + rightBorder + " : " + (rightBorder - leftBorder + 1));
    }

    private static void iterateRangeFor(int leftBorder, int rightBorder) {
        for (int i = leftBorder; i <= rightBorder; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + " оличество целых чисел в дапозоне от " + leftBorder +
                " до " + rightBorder + " : " + (rightBorder - leftBorder + 1));
    }

    private static void iterateRangeDoWhile(int leftBorder, int rightBorder) {
        int begin = leftBorder;
        do {
            System.out.print(begin + " ");
            begin++;
        } while (begin <= rightBorder);
        System.out.println("\n" + " оличество целых чисел в дапозоне от " + leftBorder +
                " до " + rightBorder + " : " + (rightBorder - leftBorder + 1));
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("¬ведите левую границу диапозона: ");
        int leftBorder = scanner.nextInt();
        System.out.print("¬ведите правую границу диапозона: ");
        int rightBorder = scanner.nextInt();
        iterateRange(leftBorder, rightBorder);
        iterateRangeFor(leftBorder, rightBorder);
        iterateRangeDoWhile(leftBorder, rightBorder);


    }
}
