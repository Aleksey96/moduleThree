package homeworkseven;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите целое число: ");
        int number = scanner.nextInt();
        int result = (number > 0) ? number + 1 : number;
        System.out.println(result);
    }
}
