package homeworkeightteen_lambda;

public class TaskTwo {
    public static void main(String[] args) {
        double fractionOne = 0.5;
        double fractionTwo = Math.PI;

        SumFraction sumFraction = (numberOne, numberTwo) -> numberOne + numberTwo;
        System.out.println("����� ���� ������: " + String.format("%.2f", sumFraction.sumFraction(fractionOne, fractionTwo)));

        MultiplicationFractions multiplicationFractions = (numberOne, numberTwo) -> numberOne * numberTwo;
        System.out.println("������������ ���� ������: " + String.format("%.2f", multiplicationFractions.multiplicationFractions(fractionOne, fractionTwo)));

        DifferenceFractions differenceFractions = (numberOne, numberTwo) -> numberOne - numberTwo;
        System.out.println("������� ���� ������: " + String.format("%.2f", differenceFractions.differenceFractions(fractionOne, fractionTwo)));

        DivisionFractions divisionFractions = (numberOne, numberTwo) -> numberOne / numberTwo;
        System.out.println("�������� ���� ������: " + String.format("%.2f", divisionFractions.divisionFractions(fractionOne, fractionTwo)));


    }
}
