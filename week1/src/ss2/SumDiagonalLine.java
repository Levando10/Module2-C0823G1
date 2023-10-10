package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của ma trận  vuông  : ");
        int m = scanner.nextInt();
        int sum = 0;
        double arrParent[][] = new double[m][];


        for (int i = 0; i < arrParent.length; i++) {
            System.out.println("__________________________________________________");
            arrParent[i] = new double[m];
            System.out.println("Nhập giá trị của mảng " + (i + 1) + " :");
            for (int j = 0; j < arrParent[i].length; j++) {
                System.out.print("Nhập phần tử thứ " + (j + 1) + " :");
                arrParent[i][j] = scanner.nextInt();
            }
        }

        System.out.println("__________________________________________________");
        System.out.println("Mảng gồm : ");
        for (int i = 0; i < arrParent.length; i++) {
            for (int j = 0; j < arrParent[i].length; j++) {
                System.out.print("  " + arrParent[i][j] + " ");
            }
            System.out.println("");
            System.out.println("");
        }


        System.out.println("__________________________________________________");
        for (int i = 0; i < arrParent.length; i++) {
            sum += arrParent[i][i];

        }

        System.out.println("\nTổng các giá trị đường chéo chính của ma trận vuông là : " + sum);


    }
}
