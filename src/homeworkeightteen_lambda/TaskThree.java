package homeworkeightteen_lambda;

public class TaskThree {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;

        Minimum minimum = (number1, number2) -> Math.min(number1, number2);
        Maximum maximum = (number1, number2) -> Math.max(number1, number2);

        int minimum1 = minimum.minimum(numberOne, numberFour);
        int mimimum2 = minimum.minimum(numberThree, numberTwo);
        System.out.println("Минимум из 4: " + minimum.minimum(minimum1, mimimum2));

        int maximum1 = maximum.maximum(numberOne, numberFour);
        int maximum2 = maximum.maximum(numberThree, numberTwo);
        System.out.println("Максимум из 4: " + maximum.maximum(maximum1, maximum2));

    }
}
