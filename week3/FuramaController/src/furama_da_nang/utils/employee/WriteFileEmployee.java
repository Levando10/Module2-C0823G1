package furama_da_nang.utils.employee;

import furama_da_nang.model.model_person.Employee;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee {

  private static final String PATH = "FuramaController/src/furama_da_nang/data/employeeList.csv";

  public static void writeListEmployee(List<Employee> employees) {
    File file = new File(PATH);
    FileWriter fileWriter;
    BufferedWriter bufferedWriter = null;

    try {
      fileWriter = new FileWriter(file);
      bufferedWriter = new BufferedWriter(fileWriter);
      for (Employee temp : employees) {
//        employee = new Employee("1","văn độ","Nam","1234567","0982009465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0);
        bufferedWriter.write(
            temp.getIdEmployee() + "," + temp.getName() + "," + temp.getGender() + ","
                + temp.getIdentityNumber() + "," + temp.getPhoneNumber() + "," + temp.getBirthDay()
                + "," + temp.getEmail() + "," + temp.getPosition() + "," + temp.getLevelEducation()
                + "," + temp.getSalary());
        bufferedWriter.newLine();
      }
      bufferedWriter.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        if (bufferedWriter != null){
          bufferedWriter.close();
        }
      } catch (IOException e){
        e.printStackTrace();
      }
    }


  }
}
