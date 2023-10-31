package retake_product_to_student.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import retake_product_to_student.models.Student;


public class ReadStudent {

  private static final String PATH = "StudentManagement/src/retake_product_to_student/data/product.csv";

  public static List<Student> readFile() {
    List<Student> students = new ArrayList<>();
    BufferedReader bufferedReader = null;

    try {
      Student student;
      bufferedReader = new BufferedReader(new FileReader(PATH));
      String temp;
      String[] tempString;

      while ((temp = bufferedReader.readLine()) != null) {
        tempString = temp.split(",");
        student = new Student(Integer.parseInt(tempString[0]),
            tempString[1], Integer.parseInt(tempString[2]));
        students.add(student);

      }
      return students;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
