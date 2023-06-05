package homeworkfourt�en_inheritance;

import static java.lang.System.out;

public class TaskOne {


    public static void printSalaryEmployees(Employee... employees) {
        double sum = 0;
        for (Employee employee : employees) {
            double salaryEmployee = employee.calculateSalaryEmployee();
            out.println("���: " + employee.fullNameEmployee + ", ��� ������: " + employee.typePayment + ", �����: " + salaryEmployee);
            sum += salaryEmployee;
        }
        System.out.println("����� " + sum);
    }

    public static void main(String[] args) {

        var employee = new Rate("������", "������", 1200, 23);
        var employee1 = new Hourly("��������", "���������", 300, 552);
        var employee2 = new Piecework("��������", "��������", 550, 700);

        printSalaryEmployees(employee, employee1, employee2);

    }
}
