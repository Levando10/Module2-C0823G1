package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số lượng phần tử của mảng 1 : ");
        int length1 = scanner.nextInt();
        int[] arr1 = new int[length1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("----------------------------");

        System.out.print("Nhập số lượng phần tử của mảng 2 : ");
        int length2 = scanner.nextInt();
        int[] arr2 = new int[length2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhập số phần tử thứ " + (i + 1) + " :");
            arr2[i] = scanner.nextInt();
        }

        System.out.println("----------------------------");
        System.out.print(" Mảng 1 : "+Arrays.toString(arr1));
        System.out.println("");
        System.out.print(" Mảng 2 : " + Arrays.toString(arr2));

        int[] arr3 = new int[arr1.length + arr2.length];


        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr1.length ];
        }

        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("Mảng sau khi gộp là : "+Arrays.toString(arr3));




    }
}
