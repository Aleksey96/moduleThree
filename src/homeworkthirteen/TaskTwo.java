package homeworkthirteen;

public class TaskTwo {

    private static final String[] array = {
            "���", "������", "�����", "�����", "�����",
            "�������", "�����", "�", "������� ", "�",
            "����������", "����", "�", "����", "�����"
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
        System.out.println("����� ������� ����� � �������: " + "\""+theMostLongestWord+"\"" + "," +
                "\n� ��� ������ ����� " + theMostLongestWord.length() + " ����");


    }
}
