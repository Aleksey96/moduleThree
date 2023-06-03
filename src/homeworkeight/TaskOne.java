package homeworkeight;

import java.util.Scanner;

/* Использую {} в каждом case, потому что удобно визуально видеть,
 *   где каждый case начинается и заканчиватеся
 *   и из каких операторов состоит
 * */

public class TaskOne {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Введиите элемент окужности числом от 1 до 4, где \n1 - Радиус," +
                "\n2 - Диаметер,\n3 - Длина окружности," + "\n4 - Площадь окружности.");
        var elementCircle = scanner.nextInt();
        System.out.println("Введите значение элемента окружности: ");
        var volumeElementCircle = scanner.nextDouble();

        /* Использую остаток от деления на 10 для того, чтобы не спользовать if для проверки,
         * что введенное значение входиит в диапозон от 1 до 4.
         *
         * С другой стороны заставляю пользователя делать лишнюю операцию  по вводу значения элемента окружности,
         * если был бы if, то при вводе "неверного значения" сразу сообщал бы пользователю об этом.
         */

        switch (elementCircle % 10) {
            default: {
                System.out.println("Введенное значение не входит в диапозон от 1 до 4");
                break;
            }
            case 1: {
                System.out.println("Радиус окружности равен: " + volumeElementCircle + ",\n" +
                        "Диаметер окружности равен: " + (2 * volumeElementCircle) + ",\n" +
                        "Длина окружности равна: " + (2 * PI * volumeElementCircle) + ",\n" +
                        "Площадь окружности равна: " + (PI * volumeElementCircle * volumeElementCircle));
                break;
            }
            case 2: {
                System.out.println("Радиус окружности равен: " + (volumeElementCircle / 2) + ",\n" +
                        "Диаметер окружности равен: " + volumeElementCircle + ",\n" +
                        "Длина окружности равна: " + (PI * volumeElementCircle) + ",\n" +
                        "Площадь окружности равна: " + (PI * volumeElementCircle * volumeElementCircle / 4));
                break;
            }
            case 3: {
                System.out.println("Радиус окружности равен: " + (volumeElementCircle / (2 * PI)) + ",\n" +
                        "Диаметер окружности равен: " + (volumeElementCircle / PI) + ",\n" +
                        "Длина окружности равна: " + volumeElementCircle + ",\n" +
                        "Площадь окружности равна: " + (volumeElementCircle * volumeElementCircle / (4 * PI)));
                break;
            }
            case 4: {
                System.out.println("Радиус окружности равен: " + (Math.sqrt(volumeElementCircle / PI)) + ",\n" +
                        "Диаметер окружности равен: " + (2 * Math.sqrt(volumeElementCircle / PI)) + ",\n" +
                        "Длина окружности равна: " + (2 * Math.sqrt(volumeElementCircle * PI)) + ",\n" +
                        "Площадь окружности равна: " + volumeElementCircle);
            }
        }
    }
}
