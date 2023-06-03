import java.util.Arrays;

public class MoveArray {

    private static int countBetweenZero(int[] array) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (!check) {
                    check = true;
                    break;
                }
                check = false;
                continue;
            }
            if (!check) {
                if (array[i] == array[array.length - 1]) {
                    count = 0;
                    break;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 2;
        if (n > 0) {
            for (int j = 1; j <= n; j++) {
                int a = arr[arr.length - 1];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
                }
                arr[0] = a;
            }
            System.out.println(Arrays.toString(arr));
        } else {
            n = n * (-1);
            for (int j = 1; j <= n; j++) {
                int a = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = a;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}