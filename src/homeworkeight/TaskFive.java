package homeworkeight;

public class TaskFive {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.firstNumber = 9.87;
        numbers.secondNumber = 3.14;

        numbers.printNumbers();
        System.out.println(numbers.getSumValues());
        System.out.println("���������� �����: " + numbers.getMaximumValue());

        numbers.setFirstNumber(3.14);
        numbers.setSecondNumber(9.87);
        System.out.println("������ ������: " + numbers.firstNumber);
        System.out.println("������ �����: " + numbers.secondNumber);


    }
}
