public class Main {
    public static void main(String[] args) {
        int [] arroy = {105,1,3,-68,-1,4,-5,9,-21};
        String[] words = {"qwe", "axcvbn","qwertyuio'","qas","ijcniejncqpeijncqpi"};

        System.out.println("First level");
        System.out.println(findMin(arroy));
        System.out.println("--------------------------------");
        System.out.println("Second level");
        System.out.println(findMaxString(words));
    }
    // Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
    public static int findMin (int [] arroy) {

        int min = arroy[0];
        for (int i = 0; i < arroy.length; i++) {
            if (min > arroy[i]) {
                min = arroy[i];
            }

        }

        return min;
    }

    // Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.      Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2
    public static int findMaxString (String[] words){
        int res = 0;
        for (int i = 0; i < words.length -1; i++) {

           String temp = words[i];
           String temp1 = words[i+1];

           if (temp.length() < temp1.length()){
               res = temp1.length();
           }
        }
        return res;
    }



}