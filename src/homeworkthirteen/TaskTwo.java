package homeworkthirteen;

public class TaskTwo {

    private static final String[] array = {
            "Дан", "массив", "строк", "Найти", "самое",
            "длинное", "слово", "в", "массиве ", "и",
            "количество", "букв", "в", "этом", "слове"
    };

    private static String findTheMostLongestWord(String[] array) {
        int indexLongestWord = -1;
        int lengthWord = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > lengthWord) {
                lengthWord = array[i].length();
                indexLongestWord = i;
            }
        }
        return array[indexLongestWord];
    }

    public static void main(String[] args) {
        String theMostLongestWord = findTheMostLongestWord(array);
        System.out.println("Самое длинное слово в массиве: " + "\""+theMostLongestWord+"\"" + "," +
                "\nа его длинна равна " + theMostLongestWord.length() + " букв");


    }
}
