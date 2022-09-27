import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] array = {"jack'" , "nick", "john","jack","tom","john","ann","john"};

        System.out.println("First level");
        System.out.println(countOccurrence(array , "tom", 0 , 3));
        System.out.println("---------------------------------------------------");
        System.out.println("Second level");
        System.out.println(Arrays.toString(madeArray(108, 6)));

    }
    /*
        Реализовать метод, который возвращает сколько раз заданная имя встречается в массиве начиная с
        позиции start до позиции finish (включительно). Если строка не найдена, то возвращаем 0
        Например:
        countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,1,6) ->2
        countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “sad”,0,6) ->0
        countOccurrence({“jack”, “nick”, “john”,”jack”,”tom”,”john”,”ann”,”john”}, “john”,0,7) ->3
        */
    public static int countOccurrence (String [] array , String name, int min , int max ) {
        int count = 0 ;

        for (int i = 0; i < array.length; i++) {
            if ( i >= min && i <= max) {

                if (array[i] == name) {
                    count += 1;
                }
            }
        }
       return count;
    }

    /*
    Реализовать метод, который создает массив из первых n четных чисел,
    начиная с заданного числа start.
    Например, для заданных n=4, start=21: {22,24,26,28}
     */
    public static int[] madeArray (int start , int length) {

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            if (start % 2 == 0) {
                array[i] = start;
                start+=1;
            } else {
                i-=1;
                start+=1;
            }
        }
        return array;
    }


}