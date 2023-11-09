package utils.employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import model.Employee;

public class WriteFileEmployee {
  private static final String PATH = "EmployeeManagement/src/data/employeeList.csv";

  public static void WriteListEmployee(List<Employee> employees){
    File file = new File(PATH);
    FileWriter fileWriter;
    BufferedWriter bufferedWriter = null;

    try {
      fileWriter = new FileWriter(file);
      bufferedWriter = new BufferedWriter(fileWriter);

      for (Employee temp : employees){
        bufferedWriter.write(
            temp.getIdEmployee() + "," + temp.getName() + "," + temp.getGender() + ","
                + temp.getIdentityNumber() + "," + temp.getPhoneNumber() + "," + temp.getBirthDay()
                + "," + temp.getEmail() + "," + temp.getPosition() + "," + temp.getSalary());
        bufferedWriter.newLine();
      }
      bufferedWriter.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (bufferedWriter != null){
        try {
          bufferedWriter.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

    }
  }
}
