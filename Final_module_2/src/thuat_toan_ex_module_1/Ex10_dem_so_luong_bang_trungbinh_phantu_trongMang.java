package thuat_toan_ex_module_1;

public class Ex10_dem_so_luong_bang_trungbinh_phantu_trongMang {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 2, 3, 3, 5, 4, 4};
    int avr = 0;
    int countAvr = 0;
    for (int i = 0; i < arr.length; i++) {
      avr += arr[i];
    }
    avr = avr / arr.length;

    for (int i = 0; i < arr.length; i++) {
      if (avr == arr[i]) {
        countAvr++;
      }
    }
    System.out.println("Trung bình mảng : " + avr + " Số suất hiện : " + countAvr);
  }
}
