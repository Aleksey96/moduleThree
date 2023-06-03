package homeworkseven;

import java.util.Scanner;

public class TaskTwo {
    int firstNumber = 4;
    int secondNumber = 45;
    int thirdNumber = -2;
    int fourthNumber = 8;
    int countNegativeNumbers = 0;
    int countPositiveNumbers = 0;
    int sumNumbers = 0;

    public void calculateSumNumbers(int secondAddend) {
        if (sumNumbers > (sumNumbers + secondAddend)) {
            countNegativeNumbers++;
        } else {
            countPositiveNumbers++;
        }
        sumNumbers+=secondAddend;
    }

    public static void main(String[] args) {
        TaskTwo task = new TaskTwo();
        task.calculateSumNumbers(task.firstNumber);
        task.calculateSumNumbers(task.secondNumber);
        task.calculateSumNumbers(task.thirdNumber);
        task.calculateSumNumbers(task.fourthNumber);

        System.out.println("В наборе " + task.countNegativeNumbers + " отрицательных чисел" +
                " и " + task.countPositiveNumbers + " положительных чисел");
    }
}
