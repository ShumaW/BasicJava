public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("   ");

/*
Дана строка, необходимо сформировать и вывести на экран строку вида содержащую первое
и последнее слово исходной строки. Примечание: слова разделены одним/ пробелом,
строка не содержит знаков препинания.
Ограничение: в данной задаче нельзя пользоваться стандартными методам String
кроме charAt() и length(). Например:
 “     Java is a very popular language   ” ->  “Java language”
 “   Java ” ->"Java"
 “Java      language” ->"Java language"
 “” ->  “”
 "  "->""
Решение:
1. Начинаем с конца строки. Перебираем символлы, пока не попадется буква, или не
   достигнем начала строки. Таким образом пропускаем все пробелы в конце строки.
   В конце цикла rightIndex - позиция последней буквы в строке или 0, если строка
   была пустая
2. Начинаем с rightIndex. Перебираем символлы, пока не попадется ' ', или не
   достигнем начала строки. Записываем символы в lastWord. В конце цикла lastWord
   содержит последнее слово или пустое, если строка была пустая.
3. Начинаем с начала строки. Перебираем символлы, пока не попадется буква, или не
   достигнем позиции rightIndex (rightIndex точно меньше позиции конца строки).
   Таким образом пропускаем все пробелы в начале строки. В конце цикла leftIndex
    - позиция первой буквы в строке или равно rightIndex, если в строке только одно
    слово, или строка была пустая
4.  Начинаем с leftIndex. Перебираем символлы, пока не попадется ' ', или не
   достигнем позиции rightIndex. Записываем символы в firstWord.
5. Если набрали и firstWord и lastWord выводим оба, иначе только lastWord
 */
/* Заменить все циклы while на циклы for
*/

        String str="     Java is a very popular language   ";
        String firstWord="";
        String lastWord="";
        int leftIndex;
        int rightIndex;

        // 1. skip last spaces
        for (rightIndex=str.length()-1; rightIndex>=0 && str.charAt(rightIndex)==' '; ){
            rightIndex-=1;
        }
        // 2. accumulate last word
        for ( ; rightIndex>=0 && str.charAt(rightIndex)!=' ';  rightIndex-=1){
            lastWord=str.charAt(rightIndex)+lastWord;
        }
//
        // 3. skip leading spaces

        for (leftIndex=0 ;leftIndex<rightIndex &&  str.charAt(leftIndex)==' ' ; ){
            leftIndex+=1;
        }

        //4. accumulate first word
        for ( ; leftIndex<rightIndex &&  str.charAt(leftIndex)!=' ' ; leftIndex+=1){
            firstWord+=str.charAt(leftIndex);
        }
        if(firstWord!="" && lastWord!=""){
            System.out.println(firstWord+" "+lastWord);
        } else {
            System.out.println(lastWord);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Task 2");
        System.out.println("   ");

        // Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку, которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно) до позиции endIndex (не включительно). Если startIndex  «не попадает в строку» или больше endIndex выводим “error”. Если endIndex не «попадает в строку»,  выводим, начиная со startIndex до конца строки.  Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().
        //“Java is a very popular language”,  startIndex=5  endIndex=13  -> “is a ver”
        //“Java is a very popular language”,  startIndex=5  endIndex=-13  -> error
        //“Java is a very popular language”,  startIndex=5  endIndex=136  -> “is a very popular language”

        String str1 = "Java is a very popular language";
        String finalStr = "";
        int startIndex = 2;
        int endIndex = 8;
       if (startIndex<=0 || endIndex<=0 || startIndex>endIndex) {
           System.out.println("ERROR");
       } else {
            for ( ; startIndex<=str1.length()-1 && startIndex!=endIndex ;startIndex+=1)
            {
              finalStr+=str1.charAt(startIndex);

            }
           System.out.println(finalStr);
       }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Task 3");
        System.out.println("   ");

        /* Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора). Естественно, использовать циклы/  */

        int factorOne;
        int factorTwo;
        int result=0;

        // Решение
        for (factorOne=1; factorOne<10 ; factorOne+=1) {

                for (factorTwo=1; factorTwo<10 ; factorTwo+=1 ) {

                result=factorOne*factorTwo;
                System.out.printf(" " + result + " ");

                }

        System.out.println();

        }


    }


}
