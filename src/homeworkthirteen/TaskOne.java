package homeworkthirteen;

public class TaskOne {

    private static final int[] ARRAY = {4, 7, 12, 0, 7, 5, 56, 1, 0};

    private static void printElementsSubArray(int begin, int end, int[] array) {
        for (int i = begin; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int calculateCountZeroElements(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element == 0) {
                count++;
            }
        }
        return count;
    }

    private static int findIndexBeginSubArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexEndSubArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (count != 0) {
                    return i;
                }
                count++;
            }
        }
        return -1;
    }

    private static int calculateCountElementsBetweenZero(int begin, int end, int[] array) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            count++;
        }
        return count;
    }

    private static void findCountElementsBetweenZero(int[] array) {
        int indexBegin = findIndexBeginSubArray(array);
        int indexEnd = findIndexEndSubArray(array);
        switch (calculateCountZeroElements(array)) {
            case 0:
            case 1: {
                break;
            }
            case 2: {
                printElementsSubArray(indexBegin + 1, indexEnd - 1, array);
                break;
            }
            default: {
                System.out.println("Количество элементов, находящихся между нулевыми элементами: " +
                        calculateCountElementsBetweenZero(indexBegin + 1, indexEnd - 1, array));
            }
        }
    }

    public static void main(String[] args) {
        findCountElementsBetweenZero(ARRAY);
    }
}
