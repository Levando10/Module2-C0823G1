package retake_product_to_student.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import retake_product_to_student.models.Student;

public class WriteStudent {

  private static final String PATH = "StudentManagement/src/retake_product_to_student/data/product.csv";

  public static void writeToFile(List<Student> students) {

    File file = new File(PATH);
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;

    {
      try {
        fileWriter = new FileWriter(file);
        bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : students) {
          bufferedWriter.write(
              student.getId() + "," + student.getName() + "," + student.getScore());
          bufferedWriter.newLine();
        }

        bufferedWriter.flush();

      } catch (IOException e) {
        throw new RuntimeException(e);
      } finally {
        try {
          bufferedWriter.close();

        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }


}
