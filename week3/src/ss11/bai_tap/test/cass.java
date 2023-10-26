package ss11.bai_tap.test;

import java.util.Arrays;
import java.util.StringJoiner;

public class cass {

  public static void main(String[] args) {
    String s = "CodegymDaNang";

    String [] arrString = s.split("(?=[A-Z])");
    String [] newArr = Arrays.copyOf(arrString,arrString.length);

    System.out.println(Arrays.toString(arrString));

    for (int i = 0; i < arrString.length; i++) {
     newArr[i] = arrString[i].toLowerCase();
    }

    System.out.println(Arrays.toString(newArr));



    String strWithJoiner = String.join(" ", newArr);
    System.out.println(strWithJoiner);




  }
}
