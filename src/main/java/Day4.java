public class Day4 {

    public static void main(String[] args){

        int passwordCounter = 0;

        for (int i = 165432; i < 707912; i++) {
            int a = i / 100000;
            int b = i % 100000 / 10000;
            int c = i % 10000 / 1000;
            int d = i % 1000 / 100;
            int e = i % 100 / 10;
            int f = i % 10;

            if (a <= b && b <= c && c <= d && d <= e && e <= f){
                if (a == b ||b == c ||c == d ||d == e ||e == f ) {
                    System.out.println(i);
                    passwordCounter++;
                }
            }

        }

        System.out.println(passwordCounter);

    }
}
