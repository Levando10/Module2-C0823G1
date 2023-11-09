package thuat_toan_ex_module_1;

public class Ex2_1phan2MangBangBinhPhuong {

  public static void main(String[] args) {
    int[] arr = new int[]{2, 1, 3, 4, 1, 9};
    boolean checkResult;
    checkResult = checkArr(arr);
    System.out.println(checkResult);
  }

  private static boolean checkArr(int[] arr) {
    int lengthArr = (arr.length) / 2;
    for (int i = 0; i < lengthArr; i++) {
      if (arr[i] * arr[i] != arr[lengthArr + i]) {
        System.out.println(arr[i] + "" + arr[lengthArr + i]);
        return false;
      }
    }
    return true;
  }
}
