package ss2;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Nhập 1 chuỗi : ");
        String inputString = scanner.nextLine();

        System.out.print("\nNhập Kí tự muốn kiểm tra : ");
        String checkChar = scanner.nextLine();


        for (int i = 0; i < inputString.length(); i++) {
            if (checkChar.charAt(0) == inputString.charAt(i)) {
                count++;
            }
        }


        System.out.println("Kí tự " + checkChar + " Xuất hiện : " + count + " lần!!!");


    }
}
