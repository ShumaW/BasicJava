public class Main {
    public static void main(String[] args) {
        System.out.println("First level ");
        // First level: �����������, ��� �� ������ ��������� ��� ������ ����������. � ��� �������� ���������� �����������  ������ � ������� ������� (����������� ������ � ���� ����������). ���� ��������� ������  �������� �� �����: ��� ������ �������� ���� ����� ��� ������� ������� ��� �� ���������

        int age = 18;
        int category = 18;
        String result;


        if (age >= category) {
            result = "�� ������ �������� ���� �����";
        } else {
            result = "������ ������� ��� �� ��������";
        }
        System.out.println(result);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Second level ");

        //Second level: �����������, �� ������ ���������  ��� ������� ������� �� ���������� ��������. � �������� �������� ������ � ���: ����������� �������� �� ������ ������� ������, ��������, � ������� �������� ���������� � ������� ����, ��� ��������� ���� ��������� �� ��������. �����������, ��� ��� �������� ������ �����������. ������� ������� �����:
        //
        //
        //
        //���������� ����� 10% �� ����������� ����������� � �� ����������
        //
        //10% - ����� 20%   �� ����������� ����������� � 50 ����
        //
        //20% - ����� 30%   �� ����������� ����������� � 150 ���� �� �� ��������, � 200 �� ��������
        //
        //�� 30% � ����  - 500���� ����, ���� ��������� �� ��������, ������� ���� �� 3 ������.
        //���������� ���������, ������� ������������ ����� � ������� ��������������� ��������� �� �����.



        int speed = 120;
        int speedLimit = 80;
        boolean street = false;
        int fine = 0;
        int speedHigh = speed * 100 / speedLimit - 100;
        String result1 = " ";




        if ((speedHigh < 10)) {
            result1 = "�� �������� ���������� ����� �������������. ��� ����� �������� ����� " ;
            fine = 0;
        } else
            if ((speedHigh >= 10 && speedHigh < 20) )  {
                result1 = "�� ��������� ���������� ��������. ��� ����� �������� ����� ";
                fine = 50;

        } else
        if ((speedHigh >= 20 && speedHigh < 30) & street) {
                result1 = "�� ��������� ���������� �������� . ��� ����� ��������  ����� ";
                fine = 150;
        } else
        if ((speedHigh >= 20 && speedHigh < 30) & !street)  {
            result1 = "�� ��������� ���������� �������� . ��� ����� �������� ����� ";
            fine = 200;
        } else
        if ((speedHigh >= 30) & street) {
            result1 = "�� ��������� ���������� ��������. ��� ����� �������� ����� ";
            fine=500;
        } else
       if ((speedHigh >= 30) & !street) {
            fine = 500;
            result1 = "�� ��������� ���������� ��������. �� ��������� ���� �� 3 ������ � ��� ����� �������� ����� " ;
        }

        System.out.println(result1 + fine + " ����.");
    }
 }
