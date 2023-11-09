package thuat_toan_ex_module_1;

public class EX2_2_check_uoc_deulauoc_cua_so_sau {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 6, 12, 48};
    boolean check = true;
    for (int i = 1; i < arr.length; i++) {

      for (int j = 0; j <= i; j++) {
        if (arr[i] % arr[j] != 0) {
          check = false;
        }
      }
    }

    if (check) {
      System.out.println("true");
    } else {
      System.out.println("Flase");
    }
  }


}
