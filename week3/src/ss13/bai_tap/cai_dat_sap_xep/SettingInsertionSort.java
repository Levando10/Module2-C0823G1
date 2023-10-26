package ss13.bai_tap.cai_dat_sap_xep;

import java.util.Arrays;

public class SettingInsertionSort {

  public static void main(String[] args) {
    int[] array = {7, 5, 8, 1, 39, 15, 21, 17, 19, 62, 26};
    System.out.println("Mảng trước khi sắp xếp : "+Arrays.toString(array));
    insertionSort(array);
    System.out.println("Mảng sau khi sắp xếp : " + Arrays.toString(array));
  }
public static void insertionSort(int[] arr){
  int pos, x;
  for (int i = 1; i < arr.length; i++) {

    x = arr[i];
    pos = i;
    while (pos > 0 && x < arr[pos - 1]) {
      arr[pos] = arr[pos - 1];
      pos--;

    }
    arr[pos] = x;

  }

}
}
