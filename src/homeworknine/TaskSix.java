package homeworknine;

public class TaskSix {

    private final static double DEPOSIT = 350;
    private final static int MONTHS = 9;
    private final static double INTEREST = 7;

    private static double calculateDepositAmount() {
        double depositAmount = DEPOSIT;
        int countMonths = 1;
        while (countMonths <= MONTHS) {
            depositAmount += depositAmount * INTEREST / 100;
            countMonths++;
        }
        return depositAmount;
    }

    private static double calculateDepositAmountFor() {
        double depositAmount = DEPOSIT;
        for (int i = 1; i <= MONTHS; i++) {
            depositAmount += depositAmount * INTEREST / 100;
        }
        return depositAmount;
    }

    private static double calculateDepositAmountDoWhile() {
        double depositAmount = DEPOSIT;
        int countMonths = 1;
        do {
            depositAmount += depositAmount * INTEREST / 100;
            countMonths++;
        } while (countMonths <= MONTHS);
        return depositAmount;
    }

    public static void main(String[] args) {
        System.out.println("—умма вклада за " + MONTHS + " мес€цев составл€ет: " + String.format("%.2f", calculateDepositAmount()));
        System.out.println("—умма вклада за " + MONTHS + " мес€цев составл€ет: " + String.format("%.2f", calculateDepositAmountFor()));
        System.out.println("—умма вклада за " + MONTHS + " мес€цев составл€ет: " + String.format("%.2f", calculateDepositAmountDoWhile()));

    }
}