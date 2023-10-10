package ss1;

import java.util.Scanner;

public class ReadNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển : ");
        int number = scanner.nextInt();
        String result = docSoThanhChu(number);
        System.out.println(result);
    }

    public static String docSoThanhChu(int number) {
        String[] onesArr = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] upTo20Arr = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tensArr = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (number <= 10) {

            return onesArr[number];
        }
        if (number < 20) {
            return upTo20Arr[number - 10];
        }
        if (number <= 99) {
            return tensArr[number / 10] + " " + onesArr[number % 10];
        }
        if (number <= 999) {
            String hundred = " hundred and ";
            if (number % 100 == 0){
                 hundred = " hundred ";
            }

            return onesArr[number / 100] + hundred + docSoThanhChu(number % 100);
        }

        return "";
    }
}