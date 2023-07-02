package homeworksixteen_exceptions;

public class TaskFour {

    private static final int ARRAY_SIZE = 10;

    private static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }


    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) throws NotSortedArrayException {
        int index = -1;

        do {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                return index;
            }
            if (high < low) {
                throw new NotSortedArrayException("Массив не отсортирован");
            }
        } while (low <= high);
        return index;
    }

    public static void main(String[] args) throws NotSortedArrayException {
        int[] values = createRandomArray(ARRAY_SIZE);
        //int[] values = {1, 1, 2, 3, 4, 10};
        int valueToFind = values[3];
        int index = binarySearch(values, valueToFind, 0, values.length - 1);
        System.out.println(index);
    }
}
