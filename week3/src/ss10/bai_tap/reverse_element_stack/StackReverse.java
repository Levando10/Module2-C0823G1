package ss10.bai_tap.reverse_element_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackReverse {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> newStack = new Stack<Integer>();
    Stack<String> stringStack = new Stack<String>();
    System.out.print("Nhập số lượng phần tử trong Stack : ");
    int sizeStack = scanner.nextInt();

    int inputElement;
    for (int i = 0; i < sizeStack; i++) {
      System.out.print("Nhập phần tử thứ  " + (i + 1) + " :");
       inputElement = scanner.nextInt();
      stack.push(inputElement);
    }

    System.out.println("Trước khi đảo ngược : " + stack);
    for (int i = 0; i < sizeStack; i++) {
      newStack.push(stack.pop());
    }

    stack = newStack;
    System.out.println("Sau khi đảo ngược : " + stack);


    System.out.print("Nhập chuỗi kí tự : ");
    scanner.nextLine();
    String stringWord = scanner.nextLine();
    String[] arrayWord = stringWord.split(" ");
    System.out.println("Trức khi hoán đổi : " + Arrays.toString(arrayWord));

    for (int i = arrayWord.length - 1; i >= 0; i--) {
      stringStack.add(arrayWord[i]);
    }
    System.out.println("Sau khi hoán đổi : " + stringStack);

  }

}
