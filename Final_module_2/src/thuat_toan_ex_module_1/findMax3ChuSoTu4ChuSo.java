package thuat_toan_ex_module_1;

import java.util.Arrays;

public class findMax3ChuSoTu4ChuSo {

  public static void main(String[] args) {

    checkNumber(9371  );


  }

  private static int checkNumber(int num) {
    int check;
    int count = 3;
    int max = 0;
    int index = 0;
    int[] arrResult = new int[3];
    if (num < 1000) {
      return -1;
    }

    int[] arrNum = new int[4];
    while (num > 0) {
      check = num % 10;
      num = num / 10;
      arrNum[count] = check;
      count--;
    }
    System.out.println(Arrays.toString(arrNum));

    for (int i = 0; i < arrNum.length; i++) {
      if (arrNum[i] > max) {
        max = arrNum[i];
        index = i;
        arrResult[0] = arrNum[i];
      }
    }

    max = 0;
    for (int i = index + 1; i < arrNum.length; i++) {

      if (arrNum[i] > max) {
        max = arrNum[i];
        index = i;

      }
    }

    arrResult[1] = max;
    max = 0;
    for (int i = index +1; i < arrNum.length; i++) {

      if (arrNum[i] > max) {
        max = arrNum[i];
        arrResult[2] = max;
      }
    }

    System.out.println(Arrays.toString(arrResult));


    return 0;
  }

}
