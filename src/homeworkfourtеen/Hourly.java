package homeworkfourtåen;

public class Hourly extends Employee {

    //TaskOne
    Hourly(String fullNameEmployee, String typePayment, double costUnitWork, double countJobHour) {
        super(fullNameEmployee, typePayment, costUnitWork);
        super.countHourJob = countJobHour;
    }

    //TaskTwo
    Hourly(String nameEmployee, String typePayment, double costUnitWork, int countJobHour, double tax) {
        super(nameEmployee, typePayment, costUnitWork, tax);
        super.countHourJob = countJobHour;
    }

    //TaskThree
    Hourly(String nameEmployee, String typePayment, double costUnitWork, int countJobHour, double tax, boolean havingChild) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild);
        super.countHourJob = countJobHour;
    }

    //TaskFive
    Hourly(String nameEmployee, String typePayment, double costUnitWork, int countJobHour, double tax, boolean havingChild, boolean offshore) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild, offshore);
        super.countHourJob = countJobHour;
    }

    Hourly(String nameEmployee, String typePayment, double costUnitWork, int countJobHour, double tax, boolean havingChild, boolean offshore, int prize) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild, offshore, prize, countJobHour);
    }
}
