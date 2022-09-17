public class Main {
    public static void main(String[] args) {


        System.out.println(replace("Мишка косолапый по лесу идёт", 'ш', 'ф'));

    }

    // Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str меняет все символы  oldChar на
    // символы newChar.
    // Например: replace(«саша», ‘c’, ‘м’) -> «маша»

    public static String replace(String str, char oldChar, char newChar) {

        // Все заглавные буквы переводим в строчные. Программу для распознования заглавной и строчной буквы мы не пишем, т.к. ещё не знаем Character.

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