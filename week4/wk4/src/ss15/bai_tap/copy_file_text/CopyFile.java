package ss15.bai_tap.copy_file_text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

  public static void main(String[] args) throws IOException {

    File file = new File("wk4/src/ss15/bai_tap/copy_file_text/source.csv");
    File fileWrite = new File("wk4/src/ss15/bai_tap/copy_file_text/target.csv");

    BufferedWriter bufferedWriter = null;
    BufferedReader bufferedReader = null;

    try {
      String str;
      FileReader fileReader = new FileReader(file);
      FileWriter fileWriter = new FileWriter(fileWrite,true);
      bufferedReader = new BufferedReader(fileReader);
      bufferedWriter = new BufferedWriter(fileWriter);

      while ((str = bufferedReader.readLine()) != null){

        bufferedWriter.write(str);
      }


    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      bufferedReader.close();
      bufferedWriter.close();
    }

  }

}
