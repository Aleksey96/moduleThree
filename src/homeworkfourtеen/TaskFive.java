package homeworkfourtеen;

public class TaskFive {

    public static void printSalaryEmployeeOffshore(Employee... employees) {
        for (Employee employee : employees) {
            employee.calculateSalaryOffshore();
        }
    }

    public static void main(String[] args) {

        var employee = new Rate("Зайцев", "Ставка", 1200, 23, 20, true, false);
        var employee1 = new Hourly("Васильев", "Почасовая", 300, 552, 15, false, true);
        var employee2 = new Piecework("Агибалов", "Сдельная", 550, 700, 20, true, false);

        printSalaryEmployeeOffshore(employee, employee1, employee2);

    }

}
