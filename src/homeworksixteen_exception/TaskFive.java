package homeworksixteen_exception;

import java.io.IOException;

public class TaskFive {
    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();
        try {
            runner.halt();
        } catch (RuntimeException ex) {
            System.out.println("halt");
        } finally {
            System.out.println("Блок после обработки исключения");
        }

    }
}
