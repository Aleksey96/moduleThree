import java.util.Scanner;

public class Application {
    //�������� ����������� �������, � ��� ����� ��������� �������������,
    // ������� ������ �������������
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var manager = new PersonManager();
        Utils.greating("��������� �� �������� �������� �������������", "1.����������\n2.�����");
        if (scanner.nextLine().equals("2")) {
            System.out.println("��������� ���������. �� ��������!");
            System.exit(0);
        }
        Utils.greating("�������������� ���������:", "1.�������� ������������" +
                "\n2.������� ������������" +
                "\n3.�����" +
                "\n0.�����");
        while (true) {
            var input = new Scanner(System.in);
            switch (input.nextLine()) {
                case "1" -> Utils.addPersonToList(manager, input);
                case "2" -> Utils.deletePersonFromList(manager, input);
                case "3" -> Utils.searchPersonInTheList(manager, input);
                case "0" -> System.exit(0);
            }
            Utils.greating("�������������� ���������:", "1.�������� ������������" +
                    "\n2.������� ������������" +
                    "\n3.�����"+
                    "\n0.�����");
        }
    }
}
