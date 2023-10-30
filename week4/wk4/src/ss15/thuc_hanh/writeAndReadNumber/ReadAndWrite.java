package ss15.thuc_hanh.writeAndReadNumber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {

  private static final Scanner SC = new Scanner(System.in);
  private static final String PATH = "wk4/src/ss15/thuc_hanh/writeAndReadNumber/fileToRead.csv";

  public static void main(String[] args) {
    File file = new File(PATH);
    List<Integer> demos = new ArrayList<>();
    int number;
    BufferedWriter bufferedWriter = null;
    BufferedReader bufferedReader = null;
    try {
      FileReader fileReader = new FileReader(file);
      FileWriter fileWriter = new FileWriter(PATH, true);
      bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < 5; i++) {
        System.out.print("Nhập số : ");
        number = Integer.parseInt(SC.nextLine());
        bufferedWriter.write(number + "");
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
      bufferedReader = new BufferedReader(fileReader);
      String temp;
      int max = 0;
      while ((temp = bufferedReader.readLine()) != null){
        if (Integer.parseInt(temp) > max){
          max = Integer.parseInt(temp);
        }
        demos.add(Integer.parseInt(temp));
      }
      bufferedWriter.close();

      System.out.println(demos);
      System.out.println(max);


    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }
}
