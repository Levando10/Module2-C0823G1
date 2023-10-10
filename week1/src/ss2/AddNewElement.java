package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class AddNewElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {14, 4, 6, 7, 8, 6, 0, 0, 0, 0};


        System.out.print("Mảng gồm : ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nNhập phần tử muốn thêm : ");
        int number = scanner.nextInt();

        System.out.print("\nThêm ở vị trí : ");
        int index = scanner.nextInt();


        int newArr[] = Arrays.copyOf(arr, arr.length+1);
        int temp = newArr[index];
        newArr[index] = number;

        for (int i = index + 1 ; i < newArr.length   ; i++){
            int swap = newArr[i];
            newArr[i] = temp;
            temp = swap;

        }


//        System.out.print(Arrays.toString(newArr));
        for (int j = 0 ; j <  newArr.length  ; j++){
            System.out.print(newArr[j] + " ");
        }















    }
}
