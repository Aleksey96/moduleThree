package homeworkseven;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ââååäèòå öåëîå ÷ñëî îò 1 äî 5: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 5) {
            if (number == 1) {
                System.out.println(number + " - ïëîõî");
            } else if (number == 2) {
                System.out.println(number + " -  íåóäîâëåòâîğèòåëüíî");
            } else if (number == 3) {
                System.out.println(number + " - óäîâëåòâîğèòåëüíî");
            } else if (number == 4) {
                System.out.println(number + " - õîğîøî");
            } else if (number == 5) {
                System.out.println(number + " - îòëè÷íî");
            }
        } else {
            System.out.println("Îøèáêà");
        }
    }
}
