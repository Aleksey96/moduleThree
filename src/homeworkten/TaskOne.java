package homeworkten;

public class TaskOne {

    private final static int SIZE_ARRAY = 10;

    /*array[i] = (double) Math.round((1 + Math.random() * 9) * 100) / 100;
     * 1 + Math.random() * 9) - генерирую произвольное число в диапозоне [0;11)
     * (double) Math.round((1 + Math.random() * 9) * 100) / 100; - округл€ю до 2-х знаков после зап€той
     */

    private static double[] initializeArray(int sizeArray) {
        double[] array = new double[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) Math.round((1 + Math.random() * 9) * 100) / 100;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static double calculateMultiplicationElementsArray(double[] array) {
        double result = 1;
        for (double element : array) {
            result *= element;
            System.out.print(result + " ");
        }
        return result;
    }

    public static void main(String[] args) {
        double[] array = initializeArray(SIZE_ARRAY);
        double roundResult = (double) Math.round(calculateMultiplicationElementsArray(array) * 100) / 100;
        System.out.println("\n–езультат " + roundResult);


    }
}
