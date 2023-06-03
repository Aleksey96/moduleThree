package homeworkten;

public class TaskSeven {

    private final static int SIZE_ARRAY = 7;

    private static int[] createArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    /*
     * �� ���� � ������ ������� �������� �������, �.� � ��� �� ������
     * ��������� ��������
     */
    private static void findLocalMinimum(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = createArray(SIZE_ARRAY);
        System.out.println();
        findLocalMinimum(array);
    }
}
