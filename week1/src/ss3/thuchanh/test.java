package ss3.thuchanh;

public class test {
    public static void main(String[] args) {
        int count = 6;
        for (int i = 6; i >= 1 ; i--) {
            for (int j = 1; j <= 6*2-1 ; j++) {
                if ( i == j || j == count) {
                    System.out.print("*" );
                }
                 else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println("");
        }

        int count2 = 6;
        for (int i = 6; i >= 1 ; i--) {
            for (int j = 1; j <= 6*2-1 ; j++) {
                if ( i == j || j == count2) {
                    System.out.print("*" );
                }
                else {
                    System.out.print(" ");
                }
            }
            count2++;
            System.out.println("");
        }


    }
}
