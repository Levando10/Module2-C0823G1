package thuat_toan_ex_module_1;

public class Ex3_CheckMangSapXep {

  public static void main(String[] args) {
    int[] arr = new int[]{7222, 832, 621, 511, 331, 21};
//9576

    boolean checkIncrease = true;
    boolean checkDecrease = true;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[i] < arr[j + i]) {
          checkDecrease = false;
        }
        if (arr[i] > arr[j + i]) {
          checkIncrease = false;
        }
      }
    }

    System.out.println(checkDecrease + " " + checkIncrease);
    if (checkIncrease == true || checkDecrease == true) {
      System.out.println("OK");
    } else {
      System.out.println("NO");
    }

  }

}
