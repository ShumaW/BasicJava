public class Main {
    public static void main(String[] args) {
        System.out.printf("First level %n");
        // ���� ����� ����� num. ���������� �������� ���������, ������� ������� �� ����� ������� ��������� num  �� 10. ��������, ���� num=3 �� ����� ������ ���� �����:
        //           	3*1=3
        //           	3*2=6
        //           	3*3=9
        //           	-----
        //          	3*9=27
        //           	3*10=30

        int num = 12;
        int factor = 1;
        int result = 0;
        // �������
        while (factor<=10) {
            result = num * factor;
            System.out.printf(num + " * " + factor + " = " + result + "%n");
            factor += 1;
        }

            System.out.printf("----------------------------------------------------------------------------------%n");
            System.out.printf("Second level %n");
            // ���� ����� ����� num. ���������� �������� ���������, ������� �������, ������� �������� � ���� �����. ��������:
            //           	3 -> 1
            //           	343 -> 3
            //           	98761 -> 5

            long num1 = -5198759;
            long num2 = num1;
            int counter = 0;
            // �������
            while (num2!=0) {
                num2/=10;
                counter+=1;
            }
            System.out.printf(num1 + "  - this number has " + counter + " digits");
        }
    }
