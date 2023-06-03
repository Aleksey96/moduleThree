package homeworkeight;

public class TaskTwo {
    public static void main(String[] args) {
        int number = 34;

        switch (number % 2) {
            case 0: {
                if (number > 0 && number != 0) {
                    System.out.println(number + " - положительное четное число");
                } else if (number < 0 && number != 0) {
                    System.out.println(number + " - отрицательное четное число");
                } else {
                    System.out.println("Нулевое число");
                }
                break;
            }
            case 1: {
                System.out.println(number + " - положительное нечетное число");
                break;
            }
            case -1: {
                System.out.println(number + " - отрицательное нечетное число");
            }
        }
    }
}
