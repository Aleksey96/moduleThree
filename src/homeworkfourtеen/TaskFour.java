package homeworkfourtеen;

import java.util.Scanner;

public class TaskFour {

    public static void printReportSalaryEmployee(Employee... employees) {
        var scanner = new Scanner(System.in);
        System.out.println("Введите курс тугриков к грн");
        double currency = scanner.nextDouble();
        for (Employee employee : employees) {
            employee.calculateSalaryCurrency(currency);
        }
    }

    public static void main(String[] args) {

        var employee = new Rate("Зайцев", "Ставка", 1200, 23, 20, true);
        var employee1 = new Hourly("Васильев", "Почасовая", 300, 552, 15, false);
        var employee2 = new Piecework("Агибалов", "Сдельная", 550, 700, 20, true);

        printReportSalaryEmployee(employee, employee1, employee2);
    }
}
