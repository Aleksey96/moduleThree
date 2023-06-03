package homeworknine;

public class TaskTwo {
    /*
     * ��������� ������������ ����� �� [1;10) - 9 * Math.random() + 1
     *  �������� 2 ����� ����� ������� -  Math.ceil((9 * Math.random() + 1) * Math.pow(10, 2)) / Math.pow(10, 2)
     */
    private static double getRealNumber() {
        return Math.ceil((9 * Math.random() + 1) * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    private static void getCost(int kilograms, double price) {
        int count = 1;
        while (count <= kilograms) {
            System.out.println("��������� " + count + " �� ������: " + String.format("%.2f", count * price));
            count++;
        }
    }

    private static void getCostDoWhile(int kilograms, double price) {
        do {
            System.out.println("��������� " + kilograms + " �� ������: " + String.format("%.2f", kilograms * price));
            kilograms--;
        } while (kilograms >= 1);

    }

    private static void getCostFor(int kilograms, double price) {
        for (int i = 1; i <= kilograms; i++) {
            System.out.println("��������� " + i + " �� ������: " + String.format("%.2f", i * price));
        }
    }


    public static void main(String[] args) {
        double price = getRealNumber();
        System.out.print("���� while: ");
        getCost(10, price);
        System.out.print("���� for: ");
        getCostFor(10, price);
        System.out.print("���� do-while: ");
        getCostDoWhile(10, price);
    }
}
