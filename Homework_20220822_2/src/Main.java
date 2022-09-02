public class Main {
    public static void main(String[] args) {

                //Используя знания об операторе IF, напишите программу, которая выводит на экран большее из 3 чисел. Числа заданы в виде переменных num1, num2, num3.
                double num1 = 189.0;
                double num2 = 189.025;
                double num3 = 189.521;
                //----------------------------------------------------------------------
                if (num1 > num2 && num1 > num3) {
                    System.out.println("Большим из данных чисел " + num1 + ", " + num2 + ", " + num3 + " является число " + num1);
                }
                if (num2 > num1 && num2 > num3) {
                    System.out.println("Большим из данных чисел " + num1 + ", " + num2 + ", " + num3 + " является число " + num2);
                }
                if (num3 > num1 && num3 > num2) {
                    System.out.println("Большим из данных чисел " + num1 + ", " + num2 + ", " + num3 + " является число " + num3);
                }

                System.out.println("-------------------------------------------------------------------------");

                double max;

                if (num1 >= num2 && num1 >= num3) {
                    max = num1;
                }
                else {
                    if (num2 >= num1 && num2 >= num3) {
                        max = num2;
                    } else {
                        max = num3;
                    }
                }
                System.out.println("Большим из данных чисел " + num1 + ", " + num2 + ", " + num3 + " является число " + max);
            }
        }



