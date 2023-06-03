package homeworkeight;

public class Numbers {
    double firstNumber;
    double secondNumber;

    public void printNumbers() {
        System.out.println("Первое число: " + firstNumber + "\n" +
                "Второе число: " + secondNumber);
    }

    public void setFirstNumber(double value) {
        firstNumber = value;
    }

    public void setSecondNumber(double value) {
        secondNumber = value;
    }

    public double getSumValues() {
        return firstNumber + secondNumber;
    }

    public double getMaximumValue() {
        return (secondNumber >= firstNumber) ? secondNumber : firstNumber;
    }
}
