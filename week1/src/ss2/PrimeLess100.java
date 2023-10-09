package ss2;

public class PrimeLess100 {
    public static void main(String[] args) {

        System.out.print("Các số nguyên tố nhỏ hơn 100 : ");
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
        }





    }
}
