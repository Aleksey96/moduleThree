import java.time.LocalDate;
import java.time.LocalTime;

public class MainLmbda {
    public static void main(String[] args) {
        int sum;
        int resultMultiplication;
        MathOpertions mathOpertions = (a, b, c) -> a + b + c;
        sum = mathOpertions.sumNumbers(3, 4, 5);
        System.out.println(sum);

        Multiplication multiplication = (a, b, c) -> a * b * c;
        resultMultiplication = multiplication.multiplication(3, 4, 5);
        System.out.println(resultMultiplication);

        NowDate nowDate = () -> System.out.println(LocalTime.now());

        nowDate.showTime();

        NowDate1 nowDate1 = () -> System.out.println(LocalDate.now());
        nowDate1.showDate();


        Minimum<Double> minimum = (numberOne, numberTwo) -> Math.min(numberOne, numberTwo);
        minimum.minimum(5.0, 4.0);
    }
}
