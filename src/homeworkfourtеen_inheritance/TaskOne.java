package homeworkfourtеen_inheritance;

import static java.lang.System.out;

public class TaskOne {


    public static void printSalaryEmployees(Employee... employees) {
        double sum = 0;
        for (Employee employee : employees) {
            double salaryEmployee = employee.calculateSalaryEmployee();
            out.println("ФИО: " + employee.fullNameEmployee + ", Вид оплаты: " + employee.typePayment + ", Сумма: " + salaryEmployee);
            sum += salaryEmployee;
        }
        System.out.println("Итого " + sum);
    }

    public static void main(String[] args) {

        var employee = new Rate("Зайцев", "Ставка", 1200, 23);
        var employee1 = new Hourly("Васильев", "Почасовая", 300, 552);
        var employee2 = new Piecework("Агибалов", "Сдельная", 550, 700);

        printSalaryEmployees(employee, employee1, employee2);

    }
}
