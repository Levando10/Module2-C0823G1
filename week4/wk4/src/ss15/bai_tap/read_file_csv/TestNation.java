package ss15.bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestNation {


  public static void main(String[] args) throws IOException {
    ArrayList<String[]> nations = new ArrayList<>();
    String line;
    BufferedReader bufferedReader = null;
    try {
      FileReader fileReader = new FileReader("wk4/src/ss15/bai_tap/read_file_csv/nation.csv");
       bufferedReader = new BufferedReader(fileReader);
      while ((line = bufferedReader.readLine()) != null) {
        String[] splitData = line.split("\t");
        nations.add(splitData);
      }


      for (String[] nationData : nations) {
        System.out.println(
            "Id : " + nationData[0] + "," + " Code : " + nationData[1] + "," + " Name : "
                + nationData[2]);
      }


    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      bufferedReader.close();
    }


  }

}
