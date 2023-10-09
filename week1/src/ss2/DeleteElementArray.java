package ss2;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arr = {14, 4, 6, 7, 8, 6, 0, 0, 0, 0};

        System.out.print("Mảng Trước khi xóa là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.print("\nNhập phần tử muốn xóa :  ");
        int number = Integer.parseInt(scanner.nextLine());
        int index = -1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int j = index; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }


            System.out.print("\nMảng sau khi xóa là : ");
            for (int k = 0; k < arr.length - 1; k++) {
                System.out.print(arr[k] + " ");
            }

        } else {
            System.out.println("Phần tử không được tìm thấy");
        }


    }

}
