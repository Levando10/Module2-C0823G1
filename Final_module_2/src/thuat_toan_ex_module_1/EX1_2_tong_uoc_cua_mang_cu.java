package thuat_toan_ex_module_1;

import java.util.Arrays;

public class EX1_2_tong_uoc_cua_mang_cu {

  public static void main(String[] args) {
    int[] arr = new int[]{2, 4, 7, 9, 1};
    for (int i = 0; i < arr.length; i++) {
      arr[i] = checkNumber(arr[i]);
    }
    System.out.println(Arrays.toString(arr));


  }

  private static int checkNumber(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum;

  }

}
