package homeworkfourt�en;

import java.util.Scanner;

public class TaskFour {

    public static void printReportSalaryEmployee(Employee... employees) {
        var scanner = new Scanner(System.in);
        System.out.println("������� ���� �������� � ���");
        double currency = scanner.nextDouble();
        for (Employee employee : employees) {
            employee.calculateSalaryCurrency(currency);
        }
    }

    public static void main(String[] args) {

        var employee = new Rate("������", "������", 1200, 23, 20, true);
        var employee1 = new Hourly("��������", "���������", 300, 552, 15, false);
        var employee2 = new Piecework("��������", "��������", 550, 700, 20, true);

        printReportSalaryEmployee(employee, employee1, employee2);
    }
}
