package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập độ dài của mảng : ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("--------------------------------");

        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Mảng gồm : " + Arrays.toString(arr));
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);
    }
}
