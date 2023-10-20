package ss4.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of array : ");
    int numRandom = scanner.nextInt();
    System.out.println("Enter search value : ");
    int findNum = scanner.nextInt();
    int[] arr = new int[numRandom];

    for (int i = 0; i < numRandom; i++) {
      arr[i] = (int) Math.floor(Math.random() * (numRandom - 1 + 1) + 1);
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Sort array: " + Arrays.toString(arr));

    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == findNum) {
        flag = true;
        System.out.println("Found " + findNum + " at index: " + i);
        break;
      }
    }
    if (!flag) {
      System.out.println("Found " + findNum + " not in array!!!");

    }


  }
}
