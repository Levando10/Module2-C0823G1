package furama_da_nang.utils.employee;

import furama_da_nang.model.model_person.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {

  private static final String PATH = "FuramaController/src/furama_da_nang/data/employeeList.csv";
  public static List<Employee>  ReadListEmployee (){
    List<Employee> employees = new ArrayList<>();
    BufferedReader bufferedReader = null;
    FileReader fileReader = null;

    try {
      fileReader = new FileReader(PATH);
      bufferedReader = new BufferedReader(fileReader);
      Employee employee;
      String temp;
      String[] tempString;
    while ((temp = bufferedReader.readLine()) != null){
      tempString = temp.split(",");
      // employee = new Employee("1","văn độ","Nam","1234567","0982009465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0);
      employee = new Employee(tempString[0],tempString[1],tempString[2],tempString[3],tempString[4],tempString[5],tempString[6],tempString[7],tempString[8],Double.parseDouble(tempString[9]));
      employees.add(employee);
    }

    return employees == null? new ArrayList<>():employees;


    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (bufferedReader != null){
        try {
          bufferedReader.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }

  }


}
