package ss9.thuc_hanh.test;

import java.util.Arrays;

public class MyListTest {

  public static void main(String[] args) {
    MyList<Integer> listInteger = new MyList<Integer>();
    listInteger.add(1);
    listInteger.add(74);
    listInteger.add(1);
    listInteger.add(74);
    listInteger.add(1);

    System.out.println(listInteger.get(4));

  }
}
