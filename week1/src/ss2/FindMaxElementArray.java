package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        System.out.print("Nhập số lượng mảng con : ");
        int m = scanner.nextInt();
        int arrParent[][] = new int[m][];
        int indexI = 0;
        int indexJ = 0;

        for (int i = 0; i < arrParent.length; i++) {
            System.out.println("__________________________________________________");
            System.out.print("Nhập số lượng phần tử của  mảng con " + (i + 1) + " :");
            int n = scanner.nextInt();
            arrParent[i] = new int[n];
            for (int j = 0; j < arrParent[i].length; j++) {
                System.out.print("Nhập phần tử thứ " + (j + 1) + " :");
                arrParent[i][j] = scanner.nextInt();
                if (arrParent[i][j] > max) {
                    max = arrParent[i][j];
                    indexI = i;
                    indexJ = j;

                }
            }

        }

        System.out.println("Mảng gồm : " + Arrays.deepToString(arrParent));
        System.out.println("Phần tử lớn nhất trong mảng là : " + max + " có vị trí là : " + (indexI) + " " + (indexJ));


    }
}
