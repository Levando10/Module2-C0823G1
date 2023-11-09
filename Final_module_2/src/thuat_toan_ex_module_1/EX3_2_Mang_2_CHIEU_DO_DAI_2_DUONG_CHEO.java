package thuat_toan_ex_module_1;


import java.util.Arrays;

public class EX3_2_Mang_2_CHIEU_DO_DAI_2_DUONG_CHEO {

  public static void main(String[] args) {
    System.out.print("Nhập độ dài mảng : ");
    int lengthMatrix = Validate.checkInputInteger();
    int[][] arr = new int[lengthMatrix][lengthMatrix];
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print("Nhập phần tử [" + i + "] [" + j + "]");
        arr[i][j] = Validate.checkInputInteger();
      }
      sum += arr[i][i] + arr[i][arr.length - 1 - i];
      System.out.println("" + arr[i][i]);
      System.out.println("" + arr[i][arr.length - 1 - i]);
    }

    System.out.println(sum);
    System.out.println(Arrays.deepToString(arr));

  }
}
