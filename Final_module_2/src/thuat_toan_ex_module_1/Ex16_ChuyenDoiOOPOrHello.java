package thuat_toan_ex_module_1;

import java.util.Arrays;

public class Ex16_ChuyenDoiOOPOrHello {

  public static void main(String[] args) {
    String result = "";
    String check = "Object oriented Programming";
    check = check.replaceAll("\\s+", " ");
    check = check.trim();
    System.out.println(check);

    String[] arrString = check.split(" ");
    System.out.println(Arrays.toString(arrString));
    if (arrString.length == 1) {
      System.out.println(check);
    } else {
      for (int i = 0; i < arrString.length; i++) {
        result += arrString[i].charAt(0);
      }
      result = result.toUpperCase();
    }
    System.out.println(result);
  }

}
