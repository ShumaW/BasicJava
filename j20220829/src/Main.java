public class Main {
    public static void main(String[] args) {
        System.out.println("First level");
        // ���������� �������� ���������, ������� �������� ��� ����� ����� � ���������  ����� num1 � num2 ������������. ������, num1 ����� ���� ��� ������, ��� ������ ��� �����  num2.
        //��������: num1=3   num2=5;   �������
        //3
        //4
        //5

        int num1 = 9;
        int num2 = 1;
        // �������

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

        // � ���������� ������, ��� ������� �����, ������� ������� �� 2 �������� ������� ��������� �� 2�. ��� ������� �����, ������� ������� �� 3 �������� ������� �������� �� 3�

        int num3 = 25;
        int num4 = 1;

        if (num3<=num4){
            while (num3<=num4) {
                System.out.print(num3 + "  ");
                if (num3%2==0) {
                System.out.print(" ������� �� 2");
                }
                if (num3%3==0) {
                System.out.print(" ������� �� 3");
                }
                num3 = num3 + 1;
                System.out.println();
        }
        } else {
            while (num3>=num4) {
                System.out.print(num3 + "  ");
                if (num3%2==0) {
                    System.out.print(" ������� �� 2");
                }
                if (num3%3==0) {
                    System.out.print(" ������� �� 3");
                }
                num3 = num3 - 1;
                System.out.println();

            }
        }

    }
}

