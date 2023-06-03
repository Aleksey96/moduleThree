package homeworknine;

public class TaskFive {
    private static void printNumbers() {
        int count = 1;
        while (count <= 20) {
            if (count % 4 == 0) {
                System.out.print((count * 2) + " ");
            } else if (count % 2 == 0) {
                System.out.print(count + " ");
            }
            if (count == 19) {
                break;
            }
            count++;
        }
    }

    private static void printNumbersFor() {
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.print((i * 2) + " ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if (i == 19) {
                break;
            }
        }
    }

    private static void printNumbersDoWhile() {
        int count = 1;
        do {
            if (count % 4 == 0) {
                System.out.print((count * 2) + " ");
            } else if (count % 2 == 0) {
                System.out.print(count + " ");
            }
            if (count == 19) {
                break;
            }
            count++;
        } while (count <= 20);
    }

    public static void main(String[] args) {
        printNumbers();
        System.out.println();
        printNumbersFor();
        System.out.println();
        printNumbersDoWhile();
    }
}
