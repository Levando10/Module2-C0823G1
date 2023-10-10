package ss2;

import java.util.Scanner;

public class PrimeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int i = 2;

        System.out.print("Nhập số lượng nguyên tố đầu tiên : ");
        int number = scanner.nextInt();

        System.out.print(number + " Số nguyên tố gồm : ");


        while (number != count) {
            boolean check = primeCheck(i);
            if (check) {
                System.out.print(i + " ");
                count++;
            }

            i++;

        }
    }

    public static boolean primeCheck(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
