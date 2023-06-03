package homeworkthirteen;

public class TaskFour {

    private static final String STRING = "������, ���������, � ����������, � ����� �����";

    private static String invertRegisterString(String string) {
        String stringInvert = "";
        for (int i = 0; i < string.length(); i++) {
            //1040 - 1071 ���������
            //1072 - 1103 ��������
            stringInvert += ((int) string.charAt(i) >= 1072 && (int) string.charAt(i) <= 1103) ?
                    String.valueOf(string.charAt(i)).toUpperCase() :
                    String.valueOf(string.charAt(i)).toLowerCase();
        }
        return stringInvert;
    }

    public static void main(String[] args) {
        System.out.println(STRING);
        System.out.println(invertRegisterString(STRING));
    }
}
