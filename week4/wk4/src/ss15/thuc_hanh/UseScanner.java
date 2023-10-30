package ss15.thuc_hanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UseScanner {

  public static void main(String[] args) {
    try {
      java.io.File file = new java.io.File("E:\\codegym\\Module2-C0823G1\\week4\\wk4\\src\\ss15\\thuc_hanh\\source.csv");

      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String firstName = input.next();
        String mi = input.next();
        String lastName = input.next();
        int score = input.nextInt();
        System.out.println(firstName + " " + mi + " " + lastName + " " + score);



      }
      input.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }


  }
}
