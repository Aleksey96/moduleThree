package homeworkfourt�en;

public class TaskThree {

    public static void main(String[] args) {

        var employee = new Rate("������", "������", 1200, 23, 20, true);
        var employee1 = new Hourly("��������", "���������", 300, 552, 15, false);
        var employee2 = new Piecework("��������", "��������", 550, 700, 20, true);

        TaskTwo.printReportSalaryEmployee(employee, employee1, employee2);
    }

}
