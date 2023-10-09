package ss1;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền việt nam : ");
        double dongVn = scanner.nextDouble();
        double rate = 23000;
        double result = dongVn / rate;
        System.out.print("Số tiền  đô là  : " + result + "$ ");
    }
}
