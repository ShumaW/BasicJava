public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("   ");

/*
���� ������, ���������� ������������ � ������� �� ����� ������ ���� ���������� ������
� ��������� ����� �������� ������. ����������: ����� ��������� �����/ ��������,
������ �� �������� ������ ����������.
�����������: � ������ ������ ������ ������������ ������������ ������� String
����� charAt() � length(). ��������:
 �     Java is a very popular language   � ->  �Java language�
 �   Java � ->"Java"
 �Java      language� ->"Java language"
 �� ->  ��
 "  "->""
�������:
1. �������� � ����� ������. ���������� ��������, ���� �� ��������� �����, ��� ��
   ��������� ������ ������. ����� ������� ���������� ��� ������� � ����� ������.
   � ����� ����� rightIndex - ������� ��������� ����� � ������ ��� 0, ���� ������
   ���� ������
2. �������� � rightIndex. ���������� ��������, ���� �� ��������� ' ', ��� ��
   ��������� ������ ������. ���������� ������� � lastWord. � ����� ����� lastWord
   �������� ��������� ����� ��� ������, ���� ������ ���� ������.
3. �������� � ������ ������. ���������� ��������, ���� �� ��������� �����, ��� ��
   ��������� ������� rightIndex (rightIndex ����� ������ ������� ����� ������).
   ����� ������� ���������� ��� ������� � ������ ������. � ����� ����� leftIndex
    - ������� ������ ����� � ������ ��� ����� rightIndex, ���� � ������ ������ ����
    �����, ��� ������ ���� ������
4.  �������� � leftIndex. ���������� ��������, ���� �� ��������� ' ', ��� ��
   ��������� ������� rightIndex. ���������� ������� � firstWord.
5. ���� ������� � firstWord � lastWord ������� ���, ����� ������ lastWord
 */
/* �������� ��� ����� while �� ����� for
*/

        String str="     Java is a very popular language   ";
        String firstWord="";
        String lastWord="";
        int leftIndex;
        int rightIndex;

        // 1. skip last spaces
        for (rightIndex=str.length()-1; rightIndex>=0 && str.charAt(rightIndex)==' '; ){
            rightIndex-=1;
        }
        // 2. accumulate last word
        for ( ; rightIndex>=0 && str.charAt(rightIndex)!=' ';  rightIndex-=1){
            lastWord=str.charAt(rightIndex)+lastWord;
        }
//
        // 3. skip leading spaces

        for (leftIndex=0 ;leftIndex<rightIndex &&  str.charAt(leftIndex)==' ' ; ){
            leftIndex+=1;
        }

        //4. accumulate first word
        for ( ; leftIndex<rightIndex &&  str.charAt(leftIndex)!=' ' ; leftIndex+=1){
            firstWord+=str.charAt(leftIndex);
        }
        if(firstWord!="" && lastWord!=""){
            System.out.println(firstWord+" "+lastWord);
        } else {
            System.out.println(lastWord);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Task 2");
        System.out.println("   ");

        // ���� ������ � 2 ����� int: startIndex, endIndex. ���������� �������� � ������� �� ����� ������, ������� ������� �� ���� �������� �������� ������, ������� � ������� startIndex (������������) �� ������� endIndex (�� ������������). ���� startIndex  ��� �������� � ������ ��� ������ endIndex ������� �error�. ���� endIndex �� ��������� � ������,  �������, ������� �� startIndex �� ����� ������.  �����������: � ������ ������ ������ ������������ ������������ ������� String ����� charAt() � length().
        //�Java is a very popular language�,  startIndex=5  endIndex=13  -> �is a ver�
        //�Java is a very popular language�,  startIndex=5  endIndex=-13  -> error
        //�Java is a very popular language�,  startIndex=5  endIndex=136  -> �is a very popular language�

        String str1 = "Java is a very popular language";
        String finalStr = "";
        int startIndex = 2;
        int endIndex = 8;
       if (startIndex<=0 || endIndex<=0 || startIndex>endIndex) {
           System.out.println("ERROR");
       } else {
            for ( ; startIndex<=str1.length()-1 && startIndex!=endIndex ;startIndex+=1)
            {
              finalStr+=str1.charAt(startIndex);

            }
           System.out.println(finalStr);
       }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Task 3");
        System.out.println("   ");

        /* �������� ���������, ������� ������� �� ����� ������� ��������� (������� ��������). �����������, ������������ �����/  */

        int factorOne;
        int factorTwo;
        int result=0;

        // �������
        for (factorOne=1; factorOne<10 ; factorOne+=1) {

                for (factorTwo=1; factorTwo<10 ; factorTwo+=1 ) {

                result=factorOne*factorTwo;
                System.out.printf(" " + result + " ");

                }

        System.out.println();

        }


    }


}
