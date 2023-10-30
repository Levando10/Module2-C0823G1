package ss15.bai_tap;

import java.util.Scanner;

public class TestTriangleException {

  private final static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Nhập cạnh đầu tiên : ");
    double firstSide = checkInputDouble();
    System.out.print("Nhập cạnh thứ hai : ");
    double secondSide = checkInputDouble();
    System.out.print("Nhập cạnh thứ ba : ");
    double thirdSide = checkInputDouble();
    boolean checkSide = firstSide + secondSide <= thirdSide || secondSide + thirdSide <= firstSide
        || firstSide + thirdSide <= secondSide;

    try {
      if (checkSide) {
        throw new IllegalTriangleException("2 cạnh Bất kì cộng lại phải lớn hơn cạnh còn lại!!!");
      }


    } catch (IllegalTriangleException e) {
      System.out.println(e);
    }

  }
  public static Double checkInputDouble() {
    while (true) {
      try {
        Double checkSides = Double.parseDouble(scanner.nextLine().trim());
        if (checkSides <= 0) {
          System.out.print("Nhập độ dài lớn hơn 0 : ");
        } else {
          return checkSides;
        }

      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");

      }
    }
  }


}
