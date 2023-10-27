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
    boolean lessThanZero = firstSide <= 0 || secondSide <= 0 || thirdSide <= 0;
    boolean checkSide = firstSide + secondSide <= thirdSide || secondSide + thirdSide <= firstSide
        || firstSide + thirdSide <= secondSide;

    try {
      if (lessThanZero) {
        throw new IllegalTriangleException("Cạnh klhông thể nhỏ hoặc bằng 0!!!");
      } else {
        if (checkSide) {
          throw new IllegalTriangleException("2 cạnh Bất kì cộng lại phải lớn hơn cạnh còn lại!!!");
        }

      }

    } catch (IllegalTriangleException e) {
      System.out.println(e);
    }


  }

  public static Double checkInputDouble() {
    while (true) {
      try {
        return Double.parseDouble(scanner.nextLine().trim());
      } catch (NumberFormatException e) {
        System.err.print("Must be input number!!!\n");
        System.err.print("Enter again : ");

      }
    }
  }


}
