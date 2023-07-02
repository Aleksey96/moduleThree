package homeworkeightteen_lambda;

import java.util.Arrays;

public class TaskFour {

    private static int SIZE = 10;

    private static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 5);
        }
        return array;
    }

    private static int sum(EqualsNumber equalsNumber, int number, int[] array) {
        int sum = 0;
        for (int element : array) {
            if (equalsNumber.isEquals(number, element)) {
                sum += element;
            }
        }
        return sum;
    }

    private static int sumNumbersInRange(Range range, int[] array, int leftBorder, int rightBorder) {
        int sum = 0;
        for (int element : array) {
            if (range.isRange(leftBorder, rightBorder, element)) {
                sum += element;
            }
        }
        return sum;
    }

    private static int sumNegativeNumbers(Negative negative, int[] array) {
        int sum = 0;
        for (int element : array) {
            if (negative.isNegative(element)) {
                sum += element;
            }
        }
        return sum;
    }

    private static int sumPositiveNumbers(Positive positive, int[] array) {
        int sum = 0;
        for (int element : array) {
            if (positive.isPositive(element)) {
                sum += element;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10 - 10);
        System.out.println("Прозвольное число " + randomNumber);
        int[] array = createArray(SIZE);
        System.out.println(Arrays.toString(array));
        EqualsNumber equalsNumber = (number, elementArray) -> number == elementArray;
        System.out.println(sum(equalsNumber, randomNumber, array));
        int someInRange = sumNumbersInRange((leftBorder, rightBorder, number) ->
                number >= leftBorder && number <= rightBorder, array, 1, 10);
        System.out.println("Сумма чисел массива в диапозоне: " + someInRange);
        int sumPositive = sumPositiveNumbers(number -> number > 0, array);
        System.out.println("Сумма положительных чисел  в массиве: " + sumPositive);
        int sumNegative = sumNegativeNumbers(number -> number < 0, array);
        System.out.println("Сумма отрицательных чисел  в массиве: " + sumNegative);
    }
}
