package homeworkeight;

public class TaskFive {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.firstNumber = 9.87;
        numbers.secondNumber = 3.14;

        numbers.printNumbers();
        System.out.println(numbers.getSumValues());
        System.out.println("Наибольшее число: " + numbers.getMaximumValue());

        numbers.setFirstNumber(3.14);
        numbers.setSecondNumber(9.87);
        System.out.println("Первое чиисло: " + numbers.firstNumber);
        System.out.println("Второе число: " + numbers.secondNumber);


    }
}
