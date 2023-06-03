package homeworkeight;

/* Использую {} в каждом case, потому что удобно визуально видеть,
 *   где каждый case начинается и заканчиватеся
 *   и из каких операторов состоит
 * */

public class TaskThree {
    public static void main(String[] args) {
        int number = 17;
        switch (number / 10) {
            default: {
                System.out.println("Значение не входит в диапозон от 10 до 40");
                break;
            }
            case 1:
            case 4: {
                System.out.println(number + " учебных заданий");
                break;
            }
            case 2:
            case 3: {
                switch (number % 10) {
                    case 0: {
                        System.out.println(number + " учебное задание");
                        break;
                    }
                    case 2:
                    case 3:
                    case 4: {
                        System.out.println(number + " учебных задания");
                        break;
                    }
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        System.out.println(number + " учебных заданий");
                    }
                }
                break;
            }
        }
    }
}
