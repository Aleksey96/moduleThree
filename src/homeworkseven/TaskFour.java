package homeworkseven;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ââååäèòå öåëîå ÷ñëî îò 1 äî 7: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println(number + " - ïîíåäåëüíèê");
            } else if (number == 2) {
                System.out.println(number + " - âòîğíèèê");
            } else if (number == 3) {
                System.out.println(number + " - ñğåäà");
            } else if (number == 4) {
                System.out.println(number + " - ÷åòâåğã");
            } else if (number == 5) {
                System.out.println(number + " - ïÿòíèöà");
            } else if (number == 6) {
                System.out.println(number + " - ñóááîòà");
            } else if (number == 7) {
                System.out.println(number + " - âîñêğåñåíüå");
            }
        } else {
            System.out.println("Ââåäåíîå ÷èñëî íå âõîäèò â äèàïîçîí îò 1 äî 7.");
        }
    }
}
