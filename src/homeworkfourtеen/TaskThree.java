package homeworkfourtеen;

public class TaskThree {

    public static void main(String[] args) {

        var employee = new Rate("Зайцев", "Ставка", 1200, 23, 20, true);
        var employee1 = new Hourly("Васильев", "Почасовая", 300, 552, 15, false);
        var employee2 = new Piecework("Агибалов", "Сдельная", 550, 700, 20, true);

        TaskTwo.printReportSalaryEmployee(employee, employee1, employee2);
    }

}
