package thuat_toan_ex_module_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex20_ConvertBinary {

  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    System.out.print("Nhập số cần chuyển : ");
    int numConvert = Validate.checkInputInteger();
    int numCheck;
    while (numConvert > 0) {
      numCheck = numConvert % 2;
      numConvert = numConvert / 2;
      integers.add(numCheck);
    }

    for (int i = integers.size() - 1; i >= 0; i--) {
      System.out.print(integers.get(i));
    }


  }
}
