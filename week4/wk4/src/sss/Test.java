package sss;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    int[] arr = {32, 9, -1, 78, 31, -1, -1, 7, 11};
    int temp = arr[0];
    int t;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] != -1 && arr[j + 1] != -1){
          if (arr[j] > arr[j + 1]){
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
    }
    System.out.println(Arrays.toString(arr));

  }
}
