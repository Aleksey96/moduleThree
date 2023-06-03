import java.util.Scanner;

public class Utils {
    static void searchPersonInTheList(PersonManager manager, Scanner input) {
        String firstName;
        String lastName;
        System.out.println("¬ведите им€: ");
        firstName = input.nextLine();
        System.out.println("¬ведите фамилию: ");
        lastName = input.nextLine();
        manager.findPerson(firstName, lastName);
    }

    static void deletePersonFromList(PersonManager manager, Scanner input) {
        String firstName;
        String lastName;
        System.out.println("¬ведите им€: ");
        firstName = input.nextLine();
        System.out.println("¬ведите фамилию: ");
        lastName = input.nextLine();
        int index = manager.deletePerson(firstName, lastName);
        manager.update(index);
        manager.printPersons();
    }

    static void addPersonToList(PersonManager manager, Scanner input) {
        System.out.println("¬ведите : ");
        String firstName = input.nextLine();
        System.out.println("¬ведите фамилию: ");
        String lastName = input.nextLine();
        System.out.println("¬ведите возраст: ");
        int age = input.nextInt();
        var person = new Person(firstName, lastName, age);
        manager.addPerson(person);
        manager.printPersons();
    }

    static void greating(String s, String s2) {
        System.out.println(s);
        System.out.println(s2);
    }

}
