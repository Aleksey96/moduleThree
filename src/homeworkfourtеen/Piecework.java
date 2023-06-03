package homeworkfourtåen;

public class Piecework extends Employee {
    private int volumeJob;

    //TaskOne
    public Piecework(String nameEmployee, String typePayment, double costUnitWork, int volumeJob) {
        super(nameEmployee, typePayment, costUnitWork);
        this.volumeJob = volumeJob;
    }

    //TaskTwo
    Piecework(String nameEmployee, String typePayment, double costUnitWork, int volumeJob, double tax) {
        super(nameEmployee, typePayment, costUnitWork, tax);
        this.volumeJob = volumeJob;
    }

    //TaskThree
    Piecework(String nameEmployee, String typePayment, double costUnitWork, int volumeJob, double tax, boolean havingChild) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild);
        this.volumeJob = volumeJob;
    }

    //TaskFive
    Piecework(String nameEmployee, String typePayment, double costUnitWork, int volumeJob, double tax, boolean havingChild, boolean offshore) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild, offshore);
        this.volumeJob = volumeJob;
    }

    Piecework(String nameEmployee, String typePayment, double costUnitWork, int volumeJob, double tax, boolean havingChild, boolean offshore, int prize, int countJobHour) {
        super(nameEmployee, typePayment, costUnitWork, tax, havingChild, offshore, prize, countJobHour);
        this.volumeJob = volumeJob;
    }

    public int getVolumeJob() {
        return volumeJob;
    }

    public void setVolumeJob(int volumeJob) {
        this.volumeJob = volumeJob;
    }

    @Override
    public double calculateSalaryEmployee() {
        return costUnitWork * volumeJob;
    }
}
