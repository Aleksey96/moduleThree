package homeworkfourt�en_inheritance;

public class TaskSix {

    public static void printSalaryEmployeeWithPrize(Employee... employees) {
        for (Employee employee : employees) {
            employee.calculateSalaryEmployeeWithPrize();
        }
    }

    public static void main(String[] args) {

        var employee = new Rate("������", "������", 1200, 23, 20, true, false, 300);
        var employee1 = new Hourly("��������", "���������", 300, 552, 15, false, true, 0);
        var employee2 = new Piecework("��������", "��������", 550, 700, 20, true, false, 230, 552);

        printSalaryEmployeeWithPrize(employee, employee1, employee2);

    }
}
