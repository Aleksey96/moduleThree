package homeworkfourt�en;

public class TaskFive {

    public static void printSalaryEmployeeOffshore(Employee... employees) {
        for (Employee employee : employees) {
            employee.calculateSalaryOffshore();
        }
    }

    public static void main(String[] args) {

        var employee = new Rate("������", "������", 1200, 23, 20, true, false);
        var employee1 = new Hourly("��������", "���������", 300, 552, 15, false, true);
        var employee2 = new Piecework("��������", "��������", 550, 700, 20, true, false);

        printSalaryEmployeeOffshore(employee, employee1, employee2);

    }

}
