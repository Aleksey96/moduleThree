package AdditionalHomeWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var manager = new ProductManager();

        if (ProductManager.greetUsers(scanner).equals("1")) {
            while (true) {
                ProductManager.chooseAction(manager, scanner);
            }
        }
    }
}
