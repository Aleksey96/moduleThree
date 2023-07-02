package homeworksixteen_exceptions;

import java.io.IOException;
import java.util.Random;

public class Runner {

    private static Random rnd = new Random();

    public void halt() throws IOException {
        if (rnd.nextBoolean()) {
            throw new RuntimeException();
        } else {
            throw new IOException();
        }
    }
}
