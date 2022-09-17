public class Main {
    public static void main(String[] args) {
        System.out.println("First level. Option №1");
        cardNumber1("DE5128279087265" , 4 , 3);
        System.out.println("");
        System.out.println("First level . Option №2");
       cardNumber2("DE5128279087265" , 4 , 2);
        System.out.println("------------------------------");
        System.out.println("Second level");
        System.out.print("1. ");
        replace1("Hello world!" , "world", "all");
    }

    // Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод, который вместо заданной строки
    // с номером счета (например ”DE5128279087265”) возвращает строку вида ”DE51*********65” (количество звездочек
    // соответствует количеству засекреченных цифр).
    // Реализуйте 2 варианта метода:
    // 1) с использованием только циклов, length() и charAt()
    // 2) используя любые необходимые методы класса String
    public static String cardNumber1(String str , int num1 , int num2) {

        for (int index = 0; index < str.length(); index++) {
            String result = "";
            if (index < num1 || index > str.length() - num2) {
                result += str.charAt(index);
            } else {
                result += "*";
            }

            System.out.print(result);
        }

        return str;
    }

    public static void cardNumber2(String str1, int num1 , int num2) {
    String result = str1.substring( num1, str1.length() - num2);
    result = result.replace(result, "*********");
        System.out.println(str1.substring(0, num1) + result + str1.substring(str1.length() - num2 , str1.length()));
    }

    //Реализовать метод String replace(String str, String oldStr, String newStr) который  в данной строке str менет все подстроки oldStr на подстроки newStr Например:
    //("Hello world!", "world", "all") - "Hello all!"
    //("Hello world!", "l", "L") - "HeLLo worLd!"
    // ("Hello world!", "qwe", "L") - "Hello world!"
    // ("Hello world!", "ll", "") - "Heo world!"
    // Ограничения: в данной задаче нельзя использовать стандартные методы String, кроме length(), charAt() и equals()

    public static String replace1 (String str, String oldStr, String newStr) {
        String result = "";
        int oldIndex = 0;
        int newIndex = 0;

        for (int index = 0; index < str.length()  && newIndex < newStr.length(); index++ )

        if ( str.charAt(index) != oldStr.charAt(oldIndex) ) {
            result+= str.charAt(index);

        } else {
            result += newStr.charAt(newIndex);

            newIndex++;
            oldIndex++;

        }
        System.out.print(result + "!");
        return result;
    }
}