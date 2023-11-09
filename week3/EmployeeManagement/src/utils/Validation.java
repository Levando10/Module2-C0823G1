package utils;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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


  public static Boolean checkYesNo() {
    String result;
    while (true) {
      result = checkInputString();
      if (result.matches(YES_NO_VALID)) {
        if (result.charAt(0) == 'y' || result.charAt(0) == 'Y') {
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



  public static Long checkSalary() {
    Long salary;
    while (true) {
      try {
        salary = Long.parseLong(sc.nextLine().trim());
        while (salary <= 0) {
          System.out.print("Nhập lớn hơn 0 : ");
          salary = Long.parseLong(sc.nextLine().trim());
        }
        return salary;
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");

      }
    }
  }

  public static String checkName() {
//    ^([\p{Lu}][\p{Ll}]{1,8})(\s([\p{Lu}]|[\p{Lu}][\p{Ll}]{1,10})){0,5}$
    String input;
    while (true) {
      input = sc.nextLine();
      if (input.matches(
          "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
        return input;
      } else {
        System.err.println("Bạn nhập sai định dạng tên (không có số)!!!!");
        System.err.print("Nhập lại : ");
      }
    }

  }




  public static String checkNumberPhone() {
    String input;
    while (true) {
      try {
        input = sc.nextLine();
        if (!input.matches("^0\\d{9}$")) {
          throw new NumberFormatException();
        }
        return input;
      } catch (NumberFormatException e) {
        System.err.println("Nhập số điện thoại bắt đầu từ 0 và đủ 10 số !!!");
        System.err.print("Nhập lại : ");
      }
    }
  }

  public static String checkIdentityNumber() {
    String input;
    while (true) {
      try {
        input = sc.nextLine();
        if (!input.matches("^\\d{9,12}$")) {
          throw new NumberFormatException();
        }
        return input;
      } catch (NumberFormatException e) {
        System.err.println("Nhập số định danh phải đủ 9 hoặc 12 số !!!");
        System.err.print("Nhập lại : ");
      }
    }
  }

  public static String checkEmail() {
    String input;
    while (true) {
      input = sc.nextLine();
      if (input.matches("^[a-zA-Z0-9._-]{5,40}@[a-zA-Z0-9]{1,30}(\\.[a-zA-Z0-9]{1,10})$")) {
        return input;
      } else {
        System.err.println("Bạn nên nhập email theo định dạng (abc@domain.com)");
        System.err.print("Nhập lại : ");
      }

    }

  }

  public static String checkIdEmployee() {
    String input;
    while (true) {
      input = sc.nextLine();
      if (input.matches("NV-\\d{4}$")) {
        return input;
      } else {
        System.err.println("Bạn nên nhập id theo định dạng (NV-YYYY) Y số từ  0-9!!!");
        System.err.print("Nhập lại : ");
      }
    }
  }



  public static String inputGender() {
    System.out.println(" \nGiới tính");
    System.out.println("1. Nam");
    System.out.println("2. Nữ");
    System.out.println("3. Khác");
    System.out.print("Nhập giới tính : ");
    int chooseGender = checkInputLimit(1, 3);
    return switch (chooseGender) {
      case 1 -> "Nam";
      case 2 -> "Nữ";
      case 3 -> "Khác";
      default -> "";
    };
  }

  public static String inputBirthday() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String birthday = null;
    boolean valid = false;
    LocalDate today;
    Period age;
    LocalDate birthDate;
    while (!valid) {
      System.out.print("Nhập ngày sinh (mm/dd/YYYY): ");
      birthday = sc.nextLine().trim();
      try {
        birthDate = LocalDate.parse(birthday, formatter);
        today = LocalDate.now();
        age = Period.between(birthDate, today);
        if (age.getYears() >= 18) {
          valid = true;
        } else {
          System.out.println("Bạn chưa đủ 18 tuổi. Nhập lại.");
        }
      } catch (Exception e) {
        System.out.println("Ngày sinh không hợp lệ theo định dạng (mm/dd/YYYY): ");
      }
    }
    return birthday;
  }

  public static boolean isValidDate(String dateStr) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("d/MM/yyyy");
    dateFormat.setLenient(false);
    try {
      Date date = dateFormat.parse(dateStr);
      return true;
    } catch (ParseException e) {
      return false;
    }


  }
}