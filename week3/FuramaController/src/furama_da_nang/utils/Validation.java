package furama_da_nang.utils;


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


  public static Long checkInputRental() {
    Long rentalInput;
    while (true) {
      try {
        rentalInput = Long.parseLong(sc.nextLine().trim());
        while (rentalInput <= 0) {
          System.out.println("Nhập giá cho thuê là số dương!!!");
          System.out.print("Enter again: ");
          rentalInput = Long.parseLong(sc.nextLine().trim());
        }
        return rentalInput;
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");

      }
    }
  }


  public static Double checkInputArea() {
    Double areaUse;

    while (true) {
      try {
        areaUse = Double.parseDouble(sc.nextLine().trim());
        while (areaUse <= 30) {
          System.out.println("Nhập diện tích lớn hơn 30!!!");
          System.out.print("Enter again: ");
          areaUse = Double.parseDouble(sc.nextLine().trim());
        }
        return areaUse;
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");

      }
    }
  }

  public static Double checkSalary() {
    Double salary;
    while (true) {
      try {
        salary = Double.parseDouble(sc.nextLine().trim());
        while (salary <= 0) {
          System.out.print("Nhập lớn hơn 0 : ");
          salary = Double.parseDouble(sc.nextLine().trim());
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

  public static int checkInputLeastZero() {
    Integer checkLeastZero;
    while (true) {
      try {
        checkLeastZero = Integer.parseInt(sc.nextLine().trim());
        while (checkLeastZero < 0) {
          System.out.println("Phải là số dương!!!");
          System.out.print("Enter again: ");
          checkLeastZero = Integer.parseInt(sc.nextLine().trim());
        }
        return checkLeastZero;
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");
      }
    }
  }

  public static int checkInputMaxPeople() {
    Integer maxPeople;
    while (true) {
      try {
        maxPeople = Integer.parseInt(sc.nextLine().trim());
        while (maxPeople <= 0 || maxPeople >= 20) {
          System.out.print("Nhập số lượng trong khoảng (lớn hơn 0 và bé hơn 20) !!!");
          System.out.print("Enter again: ");
          maxPeople = Integer.parseInt(sc.nextLine().trim());
        }
        return maxPeople;
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");

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

  public static String checkIdCustomer() {
    String input;
    while (true) {
      input = sc.nextLine();
      if (input.matches("KH-\\d{4}$")) {
        return input;
      } else {
        System.err.println("Bạn nên nhập id theo định dạng (KH-YYYY) Y số từ  0-9!!!");
        System.err.print("Nhập lại : ");
      }
    }
  }

  public static String checkIdVilla() {
    String input;
    while (true) {
      input = sc.nextLine();
      if (input.matches("SVVL-\\d{4}$")) {
        return input;
      } else {
        System.err.println("Bạn nên nhập id theo định dạng (SVVL-YYYY) Y số từ  0-9!!!");
        System.err.print("Nhập lại : ");
      }
    }
  }

  public static String checkIdRoom() {
    String input;
    while (true) {
      input = sc.nextLine();
      if (input.matches("SVRO-\\d{4}$")) {
        return input;
      } else {
        System.err.println("Bạn nên nhập id theo định dạng (SVRO-YYYY) Y số từ  0-9!!!");
        System.err.print("Nhập lại : ");
      }
    }
  }

  public static String checkIdHouse() {
    String input;
    while (true) {
      input = sc.nextLine();
      if (input.matches("SVHO-\\d{4}$")) {
        return input;
      } else {
        System.err.println("Bạn nên nhập id theo định dạng (SVHO-YYYY) Y số từ  0-9!!!");
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