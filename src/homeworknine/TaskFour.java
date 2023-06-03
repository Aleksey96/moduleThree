package homeworknine;

public class TaskFour {

    /*
     * »спользую дл€ генерации произвольного числа метод getIntegerNumber()
     * »спользую тип long, т.к. диапозон значений шире чем у типа int
     */
    private static long getIntegerNumber() {
        return (long) (Math.random() * Math.pow(2, 62) - 2);
    }

    private static void printDigitsNumber(long number) {
        long remainder;
        while (number != 0) {
            remainder = number % 10;
            System.out.print(remainder + " ");
            number /= 10;
        }
    }

    private static void printDigitsNumberDoWhile(long number) {
        long remainder;
        do {
            remainder = number % 10;
            System.out.print(remainder + " ");
            number /= 10;
        } while (number != 0);
    }

    public static void main(String[] args) {
        long number = getIntegerNumber();
        System.out.println(number);
        if (number != 0) {
            printDigitsNumber(number);
            System.out.println();
            printDigitsNumberDoWhile(number);
        }
    }
}
