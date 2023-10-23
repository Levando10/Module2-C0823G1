package ss10.bai_tap.check_palindrome;

import java.util.ArrayDeque;
import java.util.Queue;

public class Palindrome {

  public static void main(String[] args) {

    String str = "Able was I ere I saw Elba";

    System.out.println("Chuỗi : " + str);
    if (checkPalindrome(str.toLowerCase())) {
      System.out.println("Đây là chuỗi Palindrome!!!");
    } else {
      System.out.println("Đây không phải là chuỗi Palindrome !!!");
    }

  }

  public static boolean checkPalindrome(String string) {
    Queue<Character> queue = new ArrayDeque<>();
    for (int i = 0; i < string.length(); i++) {
      queue.add(string.charAt(i));
    }

    for (int j = string.length() - 1; j > 0; j--) {
      if (string.charAt(j) != queue.poll()) {
        return false;
      }
    }

    return true;
  }
}
