package ss1;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền việt nam : ");
        double moneyVn = scanner.nextDouble();
        double rate = 23000;
        double result = moneyVn / rate;
        System.out.print("Số tiền  đô là  : " + result + "$ ");
    }
}
