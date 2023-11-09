package thuat_toan_ex_module_1;

import java.util.Arrays;

public class Ex3_FindUperLower {

  public static void main(String[] args) {
    String string = "LEasdC";
    System.out.println(checkStr(string));
  }

  private static boolean checkStr(String str) {
    String[] arrString = str.split("");
    System.out.println(Arrays.toString(arrString));
    int countUp = 0;
    int countLow = 0;
    String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZĂÂÁÀẢÃẠẮẰẤẦẨẪẬÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỒỐỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴĐ";
    String LOWER = "abcdefghijklmnopqrstuvwxyzăâáàảãạắằấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôồốổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ";

    for (int i = 0; i < arrString.length; i++) {
      if (UPPER.indexOf(arrString[i]) != -1) {
        countUp++;
      } else if (LOWER.indexOf(arrString[i]) != -1) {
        countLow++;
      }
    }

    return countUp == countLow;
  }

}
