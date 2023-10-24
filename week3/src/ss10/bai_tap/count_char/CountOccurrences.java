package ss10.bai_tap.count_char;

import java.util.TreeMap;

public class CountOccurrences {

  public static void main(String[] args) {
    String str = "The quick dog jump dog over the cat lazy brown cat";
    str = str.toLowerCase();
    TreeMap<Character, Integer> strings = new TreeMap<>();
    int count;
    for (int i = 0; i < str.length(); i++) {
       count = 0;
      for (int j = 0; j < str.length(); j++) {

        if (str.charAt(i) == str.charAt(j)) {
          count++;
        }
      }
      strings.putIfAbsent(str.charAt(i), count);
    }
    System.out.println(strings);
  }
}
