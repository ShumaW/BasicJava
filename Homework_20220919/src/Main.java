import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = {-8,5,6,7,2,-12,-28,28};

        System.out.println("First level");
        resultArray(-10 , 5);
        System.out.println("--------------------------------");
        System.out.println("Second level");
        System.out.println(summArray(arr));
    }

    // Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue.

    public static int [] resultArray (int minValue , int maxValue) {

//        int [] arr = new int[2];
//        int k = minValue;
//
//
//      for (int index=0 ; index < arr.length && k <= maxValue ; index++) {
//          if (index == arr.length-1) {
//              int [] temp = Arrays.copyOf (arr, arr.length);
//              arr = new int [temp.length * 2];
//              arr = Arrays.copyOf(temp, arr.length);
//              }
//          arr[index] = k;
//          k+=1;
//
//      }
//        System.out.println(Arrays.toString(arr));
//        return arr;
          int [] result = new int [maxValue - minValue];
          int index= 0;
          for (int i = minValue; i < maxValue; i++) {
            result [index] = i;
            index+=1;
         }
         return result;
         }


    // Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
    //{3, 2, -1, 5, -3} ->10
    public static int summArray (int[] arr){
        int sum = 0;
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index] > 0) {
                sum += arr[index];
            }
// или вместо if тернарный оператор sum+= (arr[index] > 0 ) ? arr [index] : 0
        }

        return sum;
    }


}

