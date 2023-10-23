package ss10.bai_tap.convert_binary_to_decimal;


import java.util.Scanner;
import java.util.Stack;


public class ConvertBinary {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> resultBinary = new Stack<>();

    System.out.print("Số thập phân là : ");
    int number = scanner.nextInt();

    int tempNumber;
    while (number != 0) {
      tempNumber = number % 2;
      stack.add(tempNumber);
      number = number / 2;
    }

//    int length = stack.size();
//    System.out.println();
//    for (int i = 0; i < length; i++) {
//      resultBinary.add(stack.pop());
//    }

    System.out.print("Chuyển qua hệ nhị phân là : " + stack);

  }
}
