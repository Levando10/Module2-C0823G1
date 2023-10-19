package ss8.baitap;

import java.util.Arrays;

public class test {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 3};
    System.out.println(solution(arr));


  }

  static boolean solution(int[] a) {
    int length = a.length;
    boolean check = false;
    for (int i = 0; i < length; i++) {
      int sum = 0;
      for (int j = 0; j < i; j++) {
        sum += a[j];
      }
      int sum1 = 0;
      for (int j = i + 1; j < a.length; j++) {
        sum1 += a[j];
      }
      if (sum == sum1) {
        check = true;
      }
    }
    if (check) {
      return true;
    } else {
      return false;
    }
  }
}
