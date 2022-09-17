public class Main {
    public static void main(String[] args) {


        System.out.println(replace("����� ��������� �� ���� ���", '�', '�'));

    }

    // �������� ����� String replace(String str, char oldChar, char newChar) ������� � ���������� ������ str ������ ��� �������  oldChar ��
    // ������� newChar.
    // ��������: replace(�����, �c�, ��) -> �����

    public static String replace(String str, char oldChar, char newChar) {

        // ��� ��������� ����� ��������� � ��������. ��������� ��� ������������� ��������� � �������� ����� �� �� �����, �.�. ��� �� ����� Character.

        str = str.toLowerCase();

        char letter = ' ';
        String result = "";

        for (int index = 0; index <= str.length() - 1; result += letter, index++) {

            if (str.charAt(index) != oldChar) {
                letter = str.charAt(index);

            } else {
                letter = newChar;
            }
        }
            return result;
    }
}