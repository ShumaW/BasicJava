public class Main {
    public static void main(String[] args) {
        System.out.printf("First level %n");
        // Р”Р°РЅРѕ С†РµР»РѕРµ С‡РёСЃР»Рѕ num. РќРµРѕР±С…РѕРґРёРјРѕ РЅР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РєРѕС‚РѕСЂР°СЏ РІС‹РІРѕРґРёС‚ РЅР° СЌРєСЂР°РЅ С‚Р°Р±Р»РёС†Сѓ СѓРјРЅРѕР¶РµРЅРёСЏ num  РґРѕ 10. РќР°РїСЂРёРјРµСЂ, РµСЃР»Рё num=3 С‚Рѕ РІС‹РІРѕРґ РґРѕР»Р¶РµРЅ Р±С‹С‚СЊ С‚Р°РєРёРј:
        //           	3*1=3
        //           	3*2=6
        //           	3*3=9
        //           	-----
        //          	3*9=27
        //           	3*10=30

        int num = 12;
        int factor = 1;
        int result = 0;

        // Решение
        while (factor <= 10) {
            result = num * factor;
            System.out.printf(num + " * " + factor + " = " + result + "%n");
            factor += 1;
        }

        System.out.printf("----------------------------------------------------------------------------------%n");
        System.out.printf("Second level %n");

        // Дано целое число num. Необходимо написать программу, которая считает, сколько разрядов в этом числе. Например:


        //           	3 -> 1
        //           	343 -> 3
        //           	98761 -> 5


        long num1 = 125444;
        long num2 = num1;
        int counter = 1;
        // Решение
        while (num2 != 0) {
            num2 /= 10;
            counter += 1;
        }
        System.out.printf(num1 + "  - this number has " + counter + " digits");
    }


}

