package ss15.thuc_hanh.TestFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

  public static void main(String[] args) throws IOException {

    String str = "Bạn và tôi không giống nhau!!";
    FileWriter fileWriter = new FileWriter("wk4/src/ss15/thuc_hanh/TestFileWriter/testFileWriter.csv");
    for (int i = 0 ; i < str.length() ; i++){
      fileWriter.write(str.charAt(i));
    }

    fileWriter.write("hello");
    fileWriter.close();
    System.out.println("thành công!!!");



  }
}
