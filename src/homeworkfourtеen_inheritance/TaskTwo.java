package homeworkfourtеen_inheritance;

public class TaskTwo {

    public static void printReportSalaryEmployee(Employee... employees) {
        for (Employee employee : employees) {
            employee.calculateSalaryWithTax();
        }
    }

    public static void main(String[] args) {

        var employee = new Rate("Зайцев", "Ставка", 1200, 23, 20);
        var employee1 = new Hourly("Васильев", "Почасовая", 300, 552, 15);
        var employee2 = new Piecework("Агибалов", "Сдельная", 550, 700, 20);

        printReportSalaryEmployee(employee, employee1, employee2);

    }
}
