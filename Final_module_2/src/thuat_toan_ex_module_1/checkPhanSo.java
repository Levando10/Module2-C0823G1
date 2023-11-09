package thuat_toan_ex_module_1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkPhanSo {

  public static void main(String[] args) {
    String text1;
    String text2;
    String pattern;
    Pattern regex;
    Matcher matcher1;
    Matcher matcher2;
    String str = "12/7";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '/') {
        count++;
      }
    }
    String[] arrStr = str.split("/");

    if (arrStr.length != 2 || count > 1) {
      System.out.println("Không phải là phần số");
    } else {
      text1 = arrStr[0];
      text2 = arrStr[1];
      int num1;
      int num2;
      pattern = "[^0-9]";
      regex = Pattern.compile(pattern);
      matcher1 = regex.matcher(text1);
      matcher2 = regex.matcher(text2);

      num1 = Integer.parseInt(text1);
      num2 = Integer.parseInt(text2);



      if (matcher1.find() || matcher2.find()) {
        System.out.println("sai");
      } else {

        if (num1 % num2 == 0 || num2 % num1 == 0) {

          if (num1 > num2) {
            num1 = num1 / num2;
            num2 = 1;
            System.out.println("" + num1 + "/" + num2);
          } else if (num1 < num2) {
            num1 = 1;
            num2 = num2 / num1;
            System.out.println("" + num1 + "/" + num2);
          }
        } else {
          System.out.println("" + num1 + "/" + num2);
        }


      }
    }

  }

}
