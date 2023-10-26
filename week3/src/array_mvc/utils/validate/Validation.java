package array_mvc.utils.validate;

import java.util.Scanner;

public class Validation {

  private static final String YES_NO_VALID = "^[Y|y|N|n]{1}$";
  private static final Scanner sc = new Scanner(System.in);

  public static int checkInputLimit(int min, int max) {
    while (true) {
      try {
        int result = Integer.parseInt(sc.nextLine());
        if (result < min || result > max) {
          throw new NumberFormatException();
        }
        return result;
      } catch (NumberFormatException e) {
        System.err.print("Just input from " + min + " to " + max + " : ");
      }
    }
  }

  public static String checkInputString() {
    while (true) {
      String result = sc.nextLine().trim();
      if (result.length() == 0) {
        System.err.println("Not Empty!!!");
        System.out.print("\nEnter again : ");

      } else {
        return result;
      }
    }
  }


  public static char checkYesNo(){
    while (true) {
      String result = checkInputString();
      if (result.matches(YES_NO_VALID)) {
        return result.charAt(0);
      } else {
        System.out.println("Please just input Y(y) or N(n)");
        System.out.print("Enter again: ");
      }
    }
  }

  public static Long checkInputLong() {
    while (true) {
      try {
        return Long.parseLong(sc.nextLine().trim());
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");

      }
    }
  }

  public static int checkInputInteger() {
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