package homeworkfourt�en_inheritance;

import static java.lang.System.out;

public class Employee {
    protected double tax;
    protected double prize;
    protected boolean offshore;
    protected boolean havingChild;
    protected double countHourJob;
    protected String typePayment;
    protected double costUnitWork;
    protected String fullNameEmployee;

    //TaskOne
    Employee(String nameEmployee, String typePayment, double costUnitWork) {
        this.fullNameEmployee = nameEmployee;
        this.typePayment = typePayment;
        this.costUnitWork = costUnitWork;
    }

    //TaskTwo
    Employee(String nameEmployee, String typePayment, double costUnitWork, double tax) {
        this(nameEmployee, typePayment, costUnitWork);
        this.tax = tax;
    }

    //TaskThree
    Employee(String nameEmployee, String typePayment, double costUnitWork, double tax, boolean havingChild) {
        this(nameEmployee, typePayment, costUnitWork);
        this.havingChild = havingChild;
        this.tax = (this.havingChild) ? tax : tax + 5;
    }

    //TaskFive
    Employee(String nameEmployee, String typePayment, double costUnitWork, double tax, boolean havingChild, boolean offshore) {
        this(nameEmployee, typePayment, costUnitWork, tax, havingChild);
        this.offshore = offshore;
    }

    //TaskSix
    Employee(String nameEmployee, String typePayment, double costUnitWork, double tax, boolean havingChild, boolean offshore, double prize, int countHourJob) {
        this(nameEmployee, typePayment, costUnitWork, tax, havingChild, offshore);
        this.prize = prize;
        this.countHourJob = countHourJob;
    }


    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public String getTypePayment() {
        return typePayment;
    }

    public double getCostUnitWork() {
        return costUnitWork;
    }

    public double getTax() {
        return tax;
    }

    public double getCountHourJob() {
        return countHourJob;
    }

    public void setFullNameEmployee(String fullNameEmployee) {
        this.fullNameEmployee = fullNameEmployee;
    }

    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }

    public void setCostUnitWork(double costUnitWork) {
        this.costUnitWork = costUnitWork;
    }

    public void serTax(double tax) {
        this.tax = tax;
    }

    public boolean isOffshore() {
        return offshore;
    }

    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }

    public boolean isHavingChild() {
        return havingChild;
    }

    public void setHavingChild(boolean havingChild) {
        this.havingChild = havingChild;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public void setCountHourJob(double countHourJob) {
        this.countHourJob = countHourJob;
    }

    protected double calculateSalaryEmployee() {
        return costUnitWork * countHourJob;
    }

    protected void calculateSalaryWithTax() {
        double salaryEmployee = calculateSalaryEmployee();
        out.println("���: " + fullNameEmployee + ", �����: " + tax + "%" + ", �����: " + salaryEmployee + ", � ������: " + (salaryEmployee - salaryEmployee * tax / 100));
    }

    protected void calculateSalaryCurrency(double currency) {
        double salaryEmployee = calculateSalaryEmployee();
        double salaryWithTax = salaryEmployee - salaryEmployee * tax / 100;
        if (typePayment.equalsIgnoreCase("���������")) {
            out.println("���: " + fullNameEmployee + ", �����: " + tax + "%" + ", �����: " + salaryEmployee +
                    ", � ������(���/������: 1/" + currency + "): " + (salaryWithTax / 2) + "/" + (salaryWithTax / 2 / currency));
        } else {
            out.println("���: " + fullNameEmployee + ", �����: " + tax + "%" + ", �����: " + salaryEmployee + ", � ������: " + salaryWithTax);
        }
    }

    protected void calculateSalaryOffshore() {
        double salaryEmployee = calculateSalaryEmployee();
        if (offshore) {
            out.println("���: " + fullNameEmployee + ", �����: " + tax + ", �����: " + salaryEmployee + ", � ������: ��, � ������: " + salaryEmployee);
        } else {
            out.println("���: " + fullNameEmployee + ", �����: " + tax + ", �����:  " + calculateSalaryEmployee() + ", � ������: ���, � ������: " + (salaryEmployee - salaryEmployee * tax / 100));
        }
    }

    //TaskSix
    protected void calculateSalaryEmployeeWithPrize() {
        double salaryEmployee = calculateSalaryEmployee();
        if (countHourJob > 200 && !offshore) {
            out.println("���: " + fullNameEmployee + ", �����: " + tax + ", �����: " + salaryEmployee + ", � ������: ���, ���-�� ������������ �����: " +
                    countHourJob + ", ������: " + prize + ", � ������: " + (salaryEmployee - salaryEmployee * tax / 100 + prize));
        } else if (countHourJob <= 200 && !offshore) {
            out.println("���: " + fullNameEmployee + ", �����: " + tax + ", �����: " + salaryEmployee + ", � ������: ���, ���-�� ������������ �����: " +
                    countHourJob + ", ������: 0.0, � ������: " + (salaryEmployee - salaryEmployee * tax / 100));
        } else {
            out.println("���: " + fullNameEmployee + ", �����: 0.0, �����: " + salaryEmployee + ", � ������: ��, ���-�� ������������ �����: " +
                    countHourJob + ", ������: 0.0, � ������: " + salaryEmployee);
        }
    }
}
