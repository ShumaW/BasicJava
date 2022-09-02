public class Main {
    public static void main(String[] args) {
        System.out.println("First level");
        // Необходимо написать программу, которая печатает все целые числа в диапазоне  между num1 и num2 включительно. Учтите, num1 может быть как меньше, так больше или равно  num2.
        //Например: num1=3   num2=5;   Выводим
        //3
        //4
        //5

        int num1 = 9;
        int num2 = 1;
        // Решение

       if (num1<=num2){
           while (num1<=num2) {
            System.out.println(num1);
            num1 = num1 + 1;
            }
       } else {
           while (num1>=num2) {
               System.out.println(num1);
               num1 = num1 - 1;
           }
       }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Second level");

        // В предыдущей задаче, для каждого числа, которое делится на 2 выводить надпись «делиться на 2». Для каждого числа, которое делится на 3 выводить надпись «делится на 3»

        int num3 = 25;
        int num4 = 1;

        if (num3<=num4){
            while (num3<=num4) {
                System.out.print(num3 + "  ");
                if (num3%2==0) {
                System.out.print(" делится на 2");
                }
                if (num3%3==0) {
                System.out.print(" делится на 3");
                }
                num3 = num3 + 1;
                System.out.println();
        }
        } else {
            while (num3>=num4) {
                System.out.print(num3 + "  ");
                if (num3%2==0) {
                    System.out.print(" делится на 2");
                }
                if (num3%3==0) {
                    System.out.print(" делится на 3");
                }
                num3 = num3 - 1;
                System.out.println();

            }
        }

    }
}

