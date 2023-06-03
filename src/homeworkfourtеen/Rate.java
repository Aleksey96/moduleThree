package homeworkfourtåen;

public class Rate extends Employee {
    private int countJobDay;

    //TaskOne
    Rate(String nameEmployee, String typePayment, double costUnitWork, int countJobDay) {
        super(nameEmployee, typePayment, costUnitWork);
        this.countJobDay = countJobDay;
    }

    //TaskTwo
    Rate(String nameEmployee, String typePayment, double costUnitWork, int countJobDay, double tax) {
        super(nameEmployee, typePayment, costUnitWork, tax);
        this.countJobDay = countJobDay;
    }

    //TaskThree
    Rate(String nameEmployee, String typePayment, double costUnitWork, int countJobDay, double tax, boolean havingChild) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild);
        this.countJobDay = countJobDay;
    }

    //TaskFive
    Rate(String nameEmployee, String typePayment, double costUnitWork, int countJobDay, double tax, boolean havingChild, boolean offshore) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild, offshore);
        this.countJobDay = countJobDay;
    }

    //TaskSix
    Rate(String nameEmployee, String typePayment, double costUnitWork, int countJobDay, double tax, boolean havingChild, boolean offshore, int prize) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild, offshore, prize, countJobDay * 24);
        this.countJobDay = countJobDay;
    }

    public int getCountJobDay() {
        return countJobDay;
    }

    public void setCountJobDay(int countJobDay) {
        this.countJobDay = countJobDay;
    }

    @Override
    public double calculateSalaryEmployee() {
        return costUnitWork * countJobDay;
    }
}
