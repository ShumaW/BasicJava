public class Main {
        public static void main(String[] args) {
            System.out.println( " ---------------------------------------------------------------------------------------------------------- " );
            System.out.println( " First level " );
            // ??????? ????? ?????? ????????. ???????? ?????????, ? ??????? ?????? 2 ??????? ?????. ????????? ?????? ???????? ?? ????? ????????? ????????, ?????????, ????????? ? ??????? ???? ?????. ????????: ?????? 2 ??????????: 10.6 ? 2.2  ? ??????????:
            //10.6 + 2.2=12.8
            //10.6 - 2.2=8.4
            //10.6 *2.2=23.32
            //10.6 / 2.2=4.818181
            double a=10.6;
            double b=2.2;
            System.out.println( a + " + " + b  + " = " + (a + b));
            System.out.println( a + " - " + b  + " = " + (a - b));
            System.out.println( a + " * " + b  + " = " + (a * b));
            System.out.println( a + " / " + b  + " = " + (a / b));
            //  -------------------------------------------------------------------------------------------------------
            System.out.println( " ---------------------------------------------------------------------------------------------------------- " );
            System.out.println( " Second level " );
            System.out.println( "" );
            //??????? ????? ?????? ? ???????? ????????? ??????????????, ?? ??????? ?????????? ??????? ?????, ???? ?? ??????? ????????? ?? N ???????????. ?????????: ??????? ????? ????? ????????? ?? ??????? 3,14RR. ????????: ???????? ????? ??????? 10 ?? (?.?. R1=10/2=5). ??????? ????? ????? 16 ?? (?.?. R1=16/2=8). ?????: 122.46
            //?????, ?? ??????? ??????????? ??????? ?????
            int difference = 6;
            //??????? ???????? ?????
            int diametr1 = 10;
            // ??????? ????? ????? ??????????
            int diametr2 = diametr1 + difference;
            // ??????? ????????
            double squareDiff = (Math.PI*(diametr2/2)*(diametr2/2)) - (Math.PI*diametr1/2*diametr1/2);
            System.out.println("??????? ????? ? ????????? " + diametr1  + " ?? ??? ?????????? ?? ???????? ?? " + difference + " ?? ????? ?????? ?? " + squareDiff + " ??.??.");
            System.out.println( "" );
            System.out.println( " ---------------------------------------------------------------------------------------------------------- " );
    }
}