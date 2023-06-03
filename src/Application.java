import java.util.Scanner;

public class Application {
    //Написать приложенние каталог, в нем можно добавлять пользователей,
    // удалять искать пользователей
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var manager = new PersonManager();
        Utils.greating("Программа по созданию каталога пользователей", "1.Продолжить\n2.Выйти");
        if (scanner.nextLine().equals("2")) {
            System.out.println("Программа завершена. До свидания!");
            System.exit(0);
        }
        Utils.greating("Предполагаемые дейсствия:", "1.Добавить пользователя" +
                "\n2.Удалить пользователя" +
                "\n3.Найти" +
                "\n0.Выйти");
        while (true) {
            var input = new Scanner(System.in);
            switch (input.nextLine()) {
                case "1" -> Utils.addPersonToList(manager, input);
                case "2" -> Utils.deletePersonFromList(manager, input);
                case "3" -> Utils.searchPersonInTheList(manager, input);
                case "0" -> System.exit(0);
            }
            Utils.greating("Предполагаемые дейсствия:", "1.Добавить пользователя" +
                    "\n2.Удалить пользователя" +
                    "\n3.Найти"+
                    "\n0.Выйти");
        }
    }
}
