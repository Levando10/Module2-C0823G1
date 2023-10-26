package ss13.bai_tap.minh_hoa_sap_xep;

import java.util.Arrays;

public class IllustrationInsertionSort {

  public static void main(String[] args) {
    int[] array = {7, 5, 8, 1, 39, 15, 21, 17, 19, 62, 26};
    int pos, x;
    for (int i = 1; i < array.length; i++) {

      x = array[i];
      pos = i;
      while (pos > 0 && x < array[pos - 1]) {
        array[pos] = array[pos - 1];
        pos--;

      }
      array[pos] = x;
      System.out.println(Arrays.toString(array));


    }

    System.out.println(Arrays.toString(array));

  }
}
