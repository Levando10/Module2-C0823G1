package thuat_toan_ex_module_1;

public class Ex8_demso_lon_nhat_trong_mang {

  public static void main(String[] args) {
    int max = 0;
    int countMax = 0;
    int[] arr = new int[]{1, 3, 6, 3, 6, 6, 6};
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= max) {
        max = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == max) {
        countMax++;
      }
    }
    System.out.println("Số lớn nhất trong mảng là " + max + ", xuất hiện " + countMax + " lần ");

  }

}
