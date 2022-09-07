public class Main {
    public static void main(String[] args) {

        // Дана строка строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:
        //“Java is a very popular language” ->  “Java language”

        String str = "Java is a very popular language";
        int index = 0;
        int index1=0;
        String str1 = "";
        String str2 = "";

        // Записываем первое слово
        while (index<str.length()&&str.charAt(index)!=' ') {
            str1+=str.charAt(index);
            index+=1;
        }

        // Записываем последнее слово
        index1=str.length()-1;
        while (index1>0 && str.charAt(index1)!=' '){
            str2=str.charAt(index1) + str2;
            index1-=1;
        }

       // Выводим на экран искомые слова
        System.out.println(str1 + " " + str2 );

    }
}