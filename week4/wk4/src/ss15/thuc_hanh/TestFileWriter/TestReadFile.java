package ss15.thuc_hanh.TestFileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestReadFile {

  public static void main(String[] args) {

    try {
      File file = new File("wk4/src/ss15/thuc_hanh/TestFileWriter/fileSum.csv");
      FileWriter writer = new FileWriter("wk4/src/ss15/thuc_hanh/TestFileWriter/result.csv");
      BufferedReader br = new BufferedReader(
          new FileReader(file));

      String line;
      int sum = 0;
      int max = 0;

      while ((line = br.readLine()) != null) {
        System.out.println(line);
        sum += Integer.parseInt(line);
        if (Integer.parseInt(line) > max) {
          max = Integer.parseInt(line);
        }

      }
      br.close();
      System.out.println(sum);
      BufferedWriter bufferedWriter = new BufferedWriter(writer);
      String result = "Giá trị lớn nhất là : " + max;
      System.out.println(result);
      bufferedWriter.write(result);
      bufferedWriter.close();
    } catch (Exception e) {
      System.err.println("Fil"
          + "e không tồn tại or nội dung có lỗi!");
    }


  }

}
