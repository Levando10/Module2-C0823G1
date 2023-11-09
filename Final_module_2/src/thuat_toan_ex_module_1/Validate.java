package thuat_toan_ex_module_1;

import java.util.Scanner;

public class Validate {

  private static final Scanner sc = new Scanner(System.in);

  public static Integer checkInputInteger() {
    while (true) {
      try {
        return Integer.parseInt(sc.nextLine().trim());
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");
      }
    }
  }
}
