public class Main {
    public static void main(String[] args) {

        // ���� ������ ������, ��������� �� ���������� ���� ����������� ��������, ���������� ������������ � ������� �� ����� ������ ���� ���������� ������ � ��������� ����� �������� ������. ����������: ����� ��������� ����� ��������, ������ �� �������� ������ ����������. �����������: � ������ ������ ������ ������������ ������������ ������� String ����� charAt() � length(). ��������:
        //�Java is a very popular language� ->  �Java language�

        String str = "Java is a very popular language";
        int index = 0;
        int index1=0;
        String str1 = "";
        String str2 = "";

        // ���������� ������ �����
        while (index<str.length()&&str.charAt(index)!=' ') {
            str1+=str.charAt(index);
            index+=1;
        }

        // ���������� ��������� �����
        index1=str.length()-1;
        while (index1>0 && str.charAt(index1)!=' '){
            str2=str.charAt(index1) + str2;
            index1-=1;
        }

       // ������� �� ����� ������� �����
        System.out.println(str1 + " " + str2 );

    }
}