package homeworkfourtеen_inheritance;

public class TaskSix {

    public static void printSalaryEmployeeWithPrize(Employee... employees) {
        for (Employee employee : employees) {
            employee.calculateSalaryEmployeeWithPrize();
        }
    }

    public static void main(String[] args) {

        var employee = new Rate("Зайцев", "Ставка", 1200, 23, 20, true, false, 300);
        var employee1 = new Hourly("Васильев", "Почасовая", 300, 552, 15, false, true, 0);
        var employee2 = new Piecework("Агибалов", "Сдельная", 550, 700, 20, true, false, 230, 552);

        printSalaryEmployeeWithPrize(employee, employee1, employee2);

    }
}
