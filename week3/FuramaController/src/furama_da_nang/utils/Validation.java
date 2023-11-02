package furama_da_nang.utils;

import java.util.Scanner;

public class Validation {

  private static final String YES_NO_VALID = "^[Y|y|N|n]{1}$";
  private static final Scanner sc = new Scanner(System.in);

  public static int checkInputLimit(int min, int max) {
    int result;
    while (true) {
      try {
         result = Integer.parseInt(sc.nextLine());
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
    String result;
    while (true) {
       result = sc.nextLine().trim();
      if (result.length() == 0) {
        System.err.println("Not Empty!!!");
        System.out.print("\nEnter again : ");

      } else {
        return result;
      }
    }
  }


  public static Boolean checkYesNo(){
    String result;
    while (true) {
       result = checkInputString();
      if (result.matches(YES_NO_VALID)) {
        if (result.charAt(0) == 'y' || result.charAt(0) == 'Y'){
          return true;
        } else {
          return false;
        }
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
  public static Double checkInputDouble() {
    while (true) {
      try {
        return Double.parseDouble(sc.nextLine().trim());
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

  public static String checkNumberPhone(){
    String input;
    while (true){
      try {
         input = sc.nextLine();
        if (!input.matches("^0\\d{9}$")){
          throw new NumberFormatException();
        }
        return input;
      }catch (NumberFormatException e){
        System.err.println("Nhập số điện thoại bắt đầu từ 0 và đủ 10 số !!!");
        System.err.print("Nhập lại : ");
      }
    }
  }
  public static String checkEmail(){
    String input;
    while (true){
       input = sc.nextLine();
      if (input.matches("^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$")){
        return input;
      } else {
        System.err.println("Bạn nên nhập email theo định dạng (abc@domain.com)");
        System.err.print("Nhập lại : ");
      }

    }

  }
  public static String checkIdEmployee(){
    String input;
    while (true){
       input = sc.nextLine();
      if (input.matches("NV-\\d{4}$")){
        return input;
      } else {
        System.err.println("Bạn nên nhập id theo định dạng (NV-YYYY) Y số từ  0-9!!!");
        System.err.print("Nhập lại : ");
      }
    }
  }
  public static String checkIdCustomer(){
    String input;
    while (true){
       input = sc.nextLine();
      if (input.matches("KH-\\d{4}$")){
        return input;
      } else {
        System.err.println("Bạn nên nhập id theo định dạng (KH-YYYY) Y số từ  0-9!!!");
        System.err.print("Nhập lại : ");
      }
    }
  }


}